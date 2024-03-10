package Solved;

public class Solution907 {
    final int M = 1_000_000_007;
    int[] arr;
    public int sumSubarrayMins(int[] arr) {
        this.arr = arr;
        return (int) (min(0, arr.length) % M);
    }

    private long min(int start, int end){
        if (start == end) return 0;
        int length = end - start;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = start; i < end; i++) {
            if (arr[i] < minVal){
                minIdx = i;
                minVal = arr[i];
            }
        }
        return ((long)(minIdx-start+1) * (end-minIdx) * minVal + min(start, minIdx) + min(minIdx+1, end)) % M;
    }
}
