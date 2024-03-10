package Solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class Solution316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();

        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        boolean[] inStack = new boolean[256];
        for (char c : s.toCharArray()) {

            count[c]--;

            if (inStack[c]) continue;

            while (!stk.isEmpty() && stk.peek() > c) {

                if (count[stk.peek()] == 0) {
                    break;
                }

                inStack[stk.pop()] = false;
            }
            stk.push(c);
            inStack[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stk.empty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
