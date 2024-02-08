package Solved;

import java.util.*;

public class Solution827 {

    static int[] dir = new int[]{-512,-1,1,512};
    public int largestIsland(int[][] grid) {

        int m = grid.length, n = grid[0].length;
        int id = 2;
        HashMap<Integer, Integer> idToArea = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1){
                    Set<Integer> counted = new HashSet<>();
                    Set<Integer> next = new HashSet<>();
                    grid[i][j] = id;
                    next.add(code(i,j));
                    Set<Integer> newFind = new HashSet<>();
                    while (!next.isEmpty()) {
                        for (int c : next) {
                            for (int d : dir) {
                                int[] cord = decode(c + d);
                                int x = cord[0], y = cord[1];
                                if (x >= 0 && x < m && y >= 0 && y < n) {
                                    if (grid[x][y] == 1) {
                                        grid[x][y] = id;
                                        newFind.add(code(x, y));
                                    }
                                }
                            }
                        }
                        counted.addAll(next);
                        next.clear();
                        next.addAll(newFind);
                        newFind.clear();
                    }
                    idToArea.put(id,counted.size());
                    id += 1;
                }
            }
        }

        int maxArea = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    int c = code(i, j);
                    HashSet<Integer> ids = new HashSet<>();
                    for (int d : dir) {
                        int[] cord = decode(c + d);
                        int x = cord[0], y = cord[1];
                        if (x >= 0 && x < m && y >= 0 && y < n)
                            ids.add(grid[x][y]);
                    }

                    int area = 1;
                    for (int k : ids)
                        area += idToArea.getOrDefault(k,0);

                    if (area > maxArea)
                        maxArea = area;
                }
            }
        }

        if (maxArea > 0) return maxArea;
        else {
            return Collections.max(idToArea.values());
        }
    }

    private static int code(int x, int y){
        return (x<<9) + y; //512x+y
    }

    private static int[] decode(int code){
        if (code < 0) return new int[]{-1,-1};
        return new int[]{code >> 9, code & 511};
    }

    public static void main(String[] args) {
        Solution827 solution827 = new Solution827();
        System.out.println(code(2,1));
        System.out.println(Arrays.toString(decode(code(2, 3))));
    }
}
