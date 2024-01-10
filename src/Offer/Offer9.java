package Offer;

import java.util.Stack;

public class Offer9 {
	static class CQueue {
		Stack<Integer> in, out;

		public CQueue() {
			in = new Stack<>();
			out = new Stack<>();
		}

		public void appendTail(int value) {
			in.add(value);
		}

		public int deleteHead() {
			if (out.empty()) {
				int length = in.size();
				for (int i = 0; i < length; i++)
					out.add(in.pop());
			}
			return out.empty() ? -1 : out.pop();
		}
	}

	public static void main(String[] args) {
		CQueue obj = new CQueue();
        obj.appendTail(3);
        obj.appendTail(5);
		System.out.println(obj.deleteHead());
		System.out.println(obj.deleteHead());
	}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
