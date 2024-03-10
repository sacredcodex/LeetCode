package Solved;

import java.util.Arrays;

public class Solution65 {
    public boolean isNumber(String s) {
        int e = s.indexOf('e');
        int E = s.indexOf('E');
        if (e == -1 && E == -1)
            return isDemical(s);
        else if (e >= 0 && E >= 0)
            return false;
        else
            e = Math.max(e, E);

        if (!isInt(s.substring(e + 1)))
            return false;
        return isDemical(s.substring(0,e));
    }

    private boolean isUnsignedInt(String str){
        if (str.length() == 0) return false;
        for (char c : str.toCharArray())
            if (c < '0' || c > '9')
                return false;
        return true;
    }

    private boolean isInt(String str){
        if (str.length() == 0) return false;
        if (str.charAt(0) == '+' || str.charAt(0) == '-')
            str = str.substring(1);
        return isUnsignedInt(str);
    }

    private boolean isDemical(String str){
        if (isInt(str)) return true;
        if (str.length() < 1)
            return false;
        if (str.charAt(0) == '+' || str.charAt(0) == '-')
            str = str.substring(1);
        int dot = str.indexOf('.');
        if (dot == -1)
            return false;
        if (str.length() == 1)
            return false;
        if (dot == 0) return isUnsignedInt(str.substring(1));
        else if (dot == str.length() - 1) return isUnsignedInt(str.substring(0, dot));
        else return isUnsignedInt(str.substring(0,dot)) && isUnsignedInt(str.substring(dot+1));
    }
}
