package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        add(n,n);
        return list;
    }

    private void add(int left, int right){
        if (left + right == 0)
            list.add(sb.toString());
        else {
            if (left == right) {
                sb.append('(');
                add(left-1, right);
                sb.delete(sb.length()-1, sb.length());
            }else{
                if (left>0) {
                    sb.append('(');
                    add(left - 1, right);
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.append(')');
                add(left, right-1);
                sb.delete(sb.length()-1, sb.length());
            }
        }
    }
}
