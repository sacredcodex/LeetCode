package Solved;

import java.util.HashSet;

public class Solution2368 {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        int[] father = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) father[i] = i;

        HashSet<Integer> set = new HashSet<>();
        for (int i : restricted) set.add(i);

        for (int[] edge : edges){
            int x = edge[0], y = edge[1];
            if (!set.contains(x) && !set.contains(y)){
                int fatherX = father[x];
                while(fatherX != father[fatherX]) fatherX = father[fatherX];
                int fatherY = father[y];
                while(fatherY != father[fatherY]) fatherY = father[fatherY];

                if (rank[fatherX] > rank[fatherY])
                    father[fatherY] = fatherX;
                else if (rank[fatherX] < rank[fatherY])
                    father[fatherX] = fatherY;
                else {
                    father[fatherY] = fatherX;
                    rank[fatherX] += 1;
                }
            }
        }

        int father0 = father[0];
        while (father0 != father[father0]) father0 = father[father0];

        int count = 1;
        for (int i = 1; i < n; i++) {
            int fatherI = father[i];
            while (fatherI != father[fatherI]) fatherI = father[fatherI];
            if (fatherI == father0) count += 1;
        }

        return count;
    }


}
