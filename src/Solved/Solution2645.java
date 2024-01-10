package Solved;

public class Solution2645 {
    public int addMinimum(String word) {
        char prev = 'a'-1;
        int count = 1;
        for (char c : word.toCharArray()){
            if (c <= prev)
                count += 1;
            prev = c;
        }
        return count * 3 - word.length();
    }
}
