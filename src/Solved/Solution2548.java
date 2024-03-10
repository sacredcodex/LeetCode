package Solved;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2548 {
    public double maxPrice(int[][] items, int capacity) {
        double price = 0;
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double rate = (double)o2[0]/o2[1] - (double)o1[0]/o1[1];
                if (rate == 0)
                    return o2[1] - o1[1];
                else if (rate > 0) return 1;
                else return -1;
            }
        });
        int idx = 0;
        while (capacity > 0){
            if (idx == items.length) return -1;
            if (capacity > items[idx][1]){
                capacity -= items[idx][1];
                price += items[idx][0];
                idx += 1;
            }else {
                price += (double)capacity/items[idx][1] *items[idx][0];
                return price;
            }
        }
        return price;
    }
}
