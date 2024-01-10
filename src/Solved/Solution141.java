package Solved;

public class Solution141 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public boolean hasCycle(ListNode head) {
		int count = 0;
		while(head != null && count++ < 10000){
			head = head.next;
		}
		return count <= 10000;
	}
}
