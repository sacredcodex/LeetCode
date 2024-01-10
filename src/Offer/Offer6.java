package Offer;

import java.util.Stack;

public class Offer6 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public int[] reversePrint(ListNode head) {
		Stack<Integer> stack = new Stack<>();
		while (head != null){
			stack.push(head.val);
			head = head.next;
		}
		int[] reverse = new int[stack.size()];
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = stack.pop();
		}
		return reverse;
	}
}
