public class Solution201 {
    public int rangeBitwiseAnd(int left, int right) {
        if (left == right)
            return left;
        int res = 0;
        int length = right - left;
        if (left % 2 == 1){
            res &= left;
        }
        if (right % 2 == 1){

        }
        return 1;
    }
}
