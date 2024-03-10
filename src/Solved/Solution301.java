package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution301 {
    StringBuilder sb;
    int count = 0;
    int length = 0;
    HashSet<String> res;
    char[] chars;
    public List<String> removeInvalidParentheses(String s) {
        sb = new StringBuilder();
        chars = s.toCharArray();
        res = new HashSet<>();
        tryChar(0);
        if (res.isEmpty()) {
            res.add("");
        }
        return new ArrayList<>(res);
    }

    private void tryChar(int i){
        if (i >= chars.length) return;
        if (i - sb.length() + length > chars.length) return;
        int org_count = count;
        boolean add = false;
        if (chars[i] == '(')
            count += 1;
        else if (chars[i] == ')')
            count -= 1;

        if (count >= 0) {
            sb.append(chars[i]);
            add = true;
            if (count == 0) {
                if (sb.length() >= length) {
                    if (sb.length() > length) {
                        res.clear();
                        length = sb.length();
                    }
                    res.add(sb.toString());
                }
            }
            tryChar(i+1);
        }

        count = org_count;
        if (add)
            sb.deleteCharAt(sb.length() - 1);

        tryChar(i+1);
    }
}
