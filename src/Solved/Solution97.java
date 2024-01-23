package Solved;

public class Solution97 {
    char [] c1, c2, c3;
    int l1, l2, l3;
    int[][] res;
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;
        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        c3 = s3.toCharArray();
        l1 = c1.length;
        l2 = c2.length;
        l3 = c3.length;
        res = new int[l1+1][l2+1];
        res[l1][l2] = 2;
        return check(0,0,0);
    }

    private boolean check(int i1, int i2, int i3){
        if (res[i1][i2] > 0)
            return res[i1][i2] != 1;
        boolean b1 = false, b2 = false;
        if (i1 < l1 && c1[i1] == c3[i3])
            b1 = check(i1+1, i2, i3+1);
        if (b1) {
            res[i1][i2] = 2;
            return true;
        }
        if (i2 < l2 && c2[i2] == c3[i3])
            b2 = check(i1, i2 + 1, i3 + 1);
        res[i1][i2] = b2? 2: 1;
        return b2;
    }


}
