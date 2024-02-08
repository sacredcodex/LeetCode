package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution10 {
    List<Character> c1, c2;
    public boolean isMatch(String s, String p) {
        c1 = new ArrayList<>();
        for (char c : s.toCharArray())
            c1.add(c);

        char[] chars = p.toCharArray();
        c2 = new ArrayList<>();
        for (char aChar : chars) {
            if (aChar == '*') {
                char c = c2.remove(c2.size() - 1);
                if (c == '.')
                    c2.add('*');
                else
                    c2.add((char) (c - 32));
            } else
                c2.add(aChar);
        }

        for (int i = 0; i < c2.size(); i++) {
            if (match(0,i))
                return true;
        }
        return false;
    }

    private boolean match(int i1, int i2){
        if (i1 == c1.size() && i2 == c2.size())
            return true;
        if (i2 == c2.size())
            return false;
        if (i1 == c1.size()) {
            while (i2 < c2.size()) {
                char char2 = c2.get(i2++);
                if (char2 >= 'a' && char2 <= 'z' || char2 == '.')
                    return false;
            }
            return true;
        }
        char char2 = c2.get(i2);
        if (char2 == '.'){
            return match(i1+1, i2+1);
        }
        if (char2 == '*'){
            for (int i = i1; i < c1.size(); i++) {
                if (match(i,i2+1))
                    return true;
            }
            return false;
        }

        if (c1.get(i1) == char2)
            return match(i1+1, i2+1);
        if (char2 < 'a'){
            char2 += 32;
            if (match(i1, i2+1))
                return true;
            int add = 0;
            while (i1+add < c1.size() && c1.get(i1+add) == char2){
                add += 1;
                if (match(i1+add, i2+1))
                    return true;
            }
        }
        return false;
    }
}
