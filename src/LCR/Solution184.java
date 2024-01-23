package LCR;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution184 {
    class Checkout {
        Queue<Integer> queue;
        Deque<Integer> deque;
        public Checkout() {
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int get_max() {
            if (deque.isEmpty())
                return -1;
            return deque.getFirst();
        }

        public void add(int value) {
            queue.add(value);
            while (!deque.isEmpty() && deque.getLast() < value)
                deque.pollLast();
            deque.add(value);
        }

        public int remove() {
            if (queue.isEmpty()) return -1;
            int fist = queue.poll();
            if (deque.peek().equals(fist))
                deque.pollFirst();
            return fist;
        }
    }
}
