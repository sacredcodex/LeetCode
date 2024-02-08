package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2861 {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int left = 0;
        int right = 200000000;
        int res = 0;
        boolean[] leftEnough = new boolean[k];
        Arrays.fill(leftEnough, true);
        while(left <= right){
            int mid = (left + right) / 2;
            boolean[] midEnough = new boolean[k];
            for (int i = 0; i < k; i++) {
                if (!leftEnough[i]){
                    midEnough[i] = false;
                    continue;
                }
                long spend = 0;
                for (int j = 0; j < n; j++) {
                    spend += Math.max((long)mid * composition.get(i).get(j) - stock.get(j), 0) * cost.get(j);
                }
                midEnough[i] = spend <= budget;
            }
            boolean containTrue = false;
            for (boolean b : midEnough){
                if (b){
                    containTrue = true;
                    break;
                }
            }
            if (containTrue){
                res = mid;
                leftEnough = midEnough;
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return res;
    }
}
