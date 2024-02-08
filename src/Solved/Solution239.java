package Solved;

import java.util.*;

public class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o2[0] - o1[0];
            }
        });

        for (int i = 0; i < k-1; i++) {
            priorityQueue.offer(new int[]{nums[i],i});
        }

        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            priorityQueue.offer(new int[]{nums[i+k-1],i+k-1});
            while (priorityQueue.peek()[1] < i){
                priorityQueue.poll();
            }
            res[i] = priorityQueue.peek()[0];
        }
        return res;
    }
}
