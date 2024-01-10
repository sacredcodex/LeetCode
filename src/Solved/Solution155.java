package Solved;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution155 {
	static class MinStack {

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

		public int getMin() {
			return min.peek();
		}
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(0);
		minStack.push(1);
		minStack.push(0);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());

	}
	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(val);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
}
