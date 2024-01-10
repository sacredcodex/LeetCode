package Solved;

import java.util.LinkedList;
import java.util.Queue;

public class Solution225 {
	class MyStack {
		Queue<Integer> queue1;
		Queue<Integer> queue2;

		public MyStack() {
			queue1 = new LinkedList<>();
			queue2 = new LinkedList<>();
		}

		public void push(int x) {
			queue2.add(x);
			while(!queue1.isEmpty()) {
				queue2.offer(queue1.poll());
			}
			queue1 = queue2;
			queue2 = new LinkedList<>();
		}

		public int pop() {
			if (queue1.isEmpty()) return -1;
			return queue1.poll();
		}

		public int top() {
			if (queue1.isEmpty()) return -1;
			return queue1.peek();
		}

		public boolean empty() {
			return queue1.isEmpty();
		}
	}
}
