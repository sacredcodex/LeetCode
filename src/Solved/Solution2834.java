package Solved;

public class Solution2834 {
    final int m = 1_000_000_007;
    public int minimumPossibleSum(int n, int target) {
        long s = target >> 1;
        long res = 0;
        if (n <= s){
            res = n;
            res *= n+1;
            res >>= 1;
        }else{
            res = s;
            res *= s+1;
            res >>= 1;
            long r = target;
            r <<= 1;
            r += n - s - 1;
            r *= n-s;
            r >>= 1;
            res += r;
        }
        return (int) (res % m);
    }
}
