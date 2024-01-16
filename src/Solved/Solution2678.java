package Solved;

public class Solution2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String p : details)
            count += (p.charAt(11)-'6')*10+(p.charAt(12)-'0') >0 ? 1 : 0;
        return count;
    }
}
