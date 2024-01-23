package LCR;

public class Solution161 {
    public int maxSales(int[] sales) {
        int max = 0;
        int res = sales[0];
        for (int i = 0; i < sales.length; i++) {
            max = Math.max(max, 0) + sales[i];
            res = Math.max(res, max);
        }
        return res;
    }
}
