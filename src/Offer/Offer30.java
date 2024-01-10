package Offer;

import java.util.Stack;

public class Offer30 {
	class MinStack {

		/** initialize your data structure here. */

		Stack<Integer> values = new Stack<>();
		Stack<Integer> min = new Stack<>();

		public MinStack() {

		}

		public void push(int val) {
			values.push(val);
			if (min.empty())
				min.push(val);
			else
				min.push(Math.min(min.peek(), val));
		}

		public void pop() {
			values.pop();
			min.pop();
		}

		public int top() {
			return values.peek();
		}

		public int min() {
			return min.peek();
		}

	}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
