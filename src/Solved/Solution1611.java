package Solved;

public class Solution1611 {
    public int minimumOneBitOperations(int n) {
        // gray code decode to decimal number
        int ans = 0;
        while (n > 0){
            ans ^= n;
            n >>= 1;
        }
        return ans;

    }
}
