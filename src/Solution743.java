import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, HashSet<int[]>> map = new HashMap<>();
        for (int[] pair : times){
            if (!map.containsKey(pair[0]))
                map.put(pair[0], new HashSet<>());
            HashSet<int[]> set = map.get(pair[0]);
            set.add(new int[]{pair[1], pair[2]});
        }
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        priorityQueue.add(new int[]{k,0});
        while(!priorityQueue.isEmpty()){
            int time = priorityQueue.peek()[1];
            int start = priorityQueue.poll()[0];
            if (!map.containsKey(start)) continue;
            HashSet<int[]> edges = map.get(start);
            for (int[] edge : edges){

            }
        }
        return -1;
    }
}
