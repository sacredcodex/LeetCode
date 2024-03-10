package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2867 {
    static boolean[] prime = new boolean[100001];
    static {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i*i < 100001; i++) {
            if (prime[i]){
                for (int j = i*i; j < 100001; j+=i) {
                    prime[j] = false;
                }
            }
        }
    }

    List<Integer>[] next;
    int count;

    public long countPaths(int n, int[][] edges) {
        next = new List[n];
        for (int i = 0; i < n; i++) next[i] = new ArrayList<Integer>();
        for (int[] edge : edges){
            int a = edge[0], b = edge[1];
            next[a-1].add(b-1);
            next[b-1].add(a-1);
        }

        long res = 0L;
        int[] nonPrime = new int[n];
        Arrays.fill(nonPrime, -1);

        for (int i = 0; i < n; i++) {
            if (prime[i+1]){
                //System.out.println("Root: "+(i+1));
                int trees = 0;
                for (int root : next[i]){
                    if (nonPrime[root] == -1) {
                        count = 0;
                        dfs(root, i);
                        nonPrime[root] = count;
                    }else {
                        count = nonPrime[root];
                    }

                    //System.out.println("Child "+(root+1)+": "+count);
                    if (count != 0) {
                        res += count;
                        res += (long) trees * count;
                        trees += count;
                    }
                }
            }
        }
        return res;
    }

    private void dfs(int num, int start){
        //System.out.println("From "+(start+1)+" to "+(num+1));
        if (!prime[num+1]){
            count += 1;
            for (int n : next[num]){
                if (n != start){
                    dfs(n, num);
                }
            }
        }
    }
}
