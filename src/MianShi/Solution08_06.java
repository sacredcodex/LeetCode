package MianShi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution08_06 {
    List<Stack<Integer>> stacks = new ArrayList<>();
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        //C.addAll(A);

        for (int i = 0; i < 3; i++) {
            stacks.add(new Stack<Integer>());
        }
        stacks.get(0).addAll(A);
        move(0, 2, A.size());
        C.addAll(stacks.get(2));
    }

    private void move(int from, int to, int height){
        if (height == 0) return;
        int another = 3 - from - to;
        move(from, another, height - 1);
        stacks.get(to).push(stacks.get(from).pop());
        move(another, to, height - 1);
    }
}
