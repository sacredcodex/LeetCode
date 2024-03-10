package Template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMP {
    private static int[] search(String s, String a){
        List<Integer> res = new ArrayList<>();
        int[] next = getNext(a);
        System.out.println(a+Arrays.toString(next));
        int m = s.length();
        int n = a.length();
        int i = 0, j = 0;
        while (i < m){
            if (s.charAt(i) == a.charAt(j)) {
                i += 1;
                j += 1;
                if (j == n) {
                    res.add(i - j);
                    j = next[j - 1];
                }
            }else if (j == 0){
                i += 1;
            }else {
                j = next[j-1];
            }
        }
        int[] ans = new int[res.size()];
        int idx = 0;
        for(int num : res){
            ans[idx++] = num;
        }
        return ans;
    }

    private static int[] getNext(String a){
        int[] next = new int[a.length()];
        char[] chars = a.toCharArray();
        int i = 1, pre = next[i-1];
        while(i < a.length()){
            if (chars[i] == chars[pre]){
                pre++;
                next[i] = pre;
                i++;
            }else if (pre != 0){
                pre = next[pre-1];
            }else{
                next[i] = 0;
                i++;
            }
        }
        return next;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(search("abcabcdabab", "abcd")));
        System.out.println(Arrays.toString(getNext("abcacabca")));
        System.out.println(Arrays.toString(getNext("papa")));
    }
}
