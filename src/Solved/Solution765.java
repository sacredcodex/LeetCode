package Solved;

import java.util.*;

public class Solution765 {
    public int minSwapsCouples(int[] row) {
        int n = row.length >> 1;
        int[] father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
        int[] rank = new int[n<<1];
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < row.length; i++) {
            if (edges.containsKey(i>>1)){
                edges.get(i>>1).add(row[i]);
            }else {
                edges.put(i>>1, new ArrayList<>());
                edges.get(i>>1).add(row[i]);
            }
        }
        for (List<Integer> edge : edges.values()){
            System.out.println(edge);
            int x = edge.get(0);
            int y = edge.get(1);
            if (x == y) continue;
            int fX = father(father, x);
            int fY = father(father, y);
            if (rank[fX] == rank[fY]){
                father[fY] = fX;
                rank[fX] += 1;
            }else if (rank[fX] > rank[fY]){
                father[fY] = fX;
            }else {
                father[fX] = fY;
            }
            System.out.println(Arrays.toString(father));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(father(father, i));
        }
        return n - set.size();
    }

    private int father(int[] father, int i){
        return i == father[i] ? i : father(father, father[i]);
    }
}
