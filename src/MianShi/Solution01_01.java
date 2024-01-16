package MianShi;

public class Solution01_01 {
    public boolean isUnique(String astr) {
        int cnt = 0;
        for(char c : astr.toCharArray()){
            int move = c-'a';
            if ((cnt & (1 << move)) != 0)
                return false;
            else
                cnt |= (1 << move);
        }
        return true;
    }
}
