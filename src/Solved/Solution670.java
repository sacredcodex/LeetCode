package Solved;

import java.util.*;

public class Solution670 {
    public int maximumSwap(int num) {
        List<Integer> l = new ArrayList<>();
        while(num>0){
            l.add(num % 10);
            num /= 10;
        }
        System.out.println(l);
        List<Integer> l_sorted = new ArrayList<>(l);
        Collections.sort(l_sorted);
        System.out.println(l_sorted);
        int smallNum = 0;
        int largeNum = 0;
        boolean change = false;
        for (int i = l.size() - 1; i >= 0; i--) {
            if (!Objects.equals(l.get(i), l_sorted.get(i))){
                smallNum = l.get(i);
                largeNum = l_sorted.get(i);
                l.set(i, largeNum);
                change = true;
                break;
            }
        }
        System.out.println(l);
        if (change)
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) == largeNum){
                    l.set(i, smallNum);
                    break;
                }
            }
        int res = 0;
        System.out.println(l);
        for (int i = l.size() - 1; i >= 0; i--) {
            res *= 10;
            res += l.get(i);
        }
        return res;
    }
}
