package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution93 {
    private int[] ints;
    public List<String> restoreIpAddresses(String s) {
        return dfs(s, 3);
    }

    private List<String> dfs(String s, int rest){
        List<String> res = new ArrayList<>();
        int l = s.length();
        for (int i = Math.max(1,l-3*rest); i <= Math.min(3,l-rest); i++) {
            String ipStr = s.substring(0,i);
            if (ipStr.length() > 1 && ipStr.charAt(0) == '0')
                break;
            if (ipStr.length() == 3 && Integer.parseInt(ipStr)>255)
                break;
            if (rest == 0){
                res.add(ipStr);
            }
            for (String str : dfs(s.substring(i), rest-1)){
                res.add(ipStr+"."+str);
            }
        }
        return res;
    }
}
