package Solved;

public class Solution876 {

	public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode middleNode(ListNode head) {
		int length = 0;
		ListNode node = head;
		while(node != null) {
			node = node.next;
			length++;
		}
		System.out.println(length);
		length = (length + 2) >> 1;
		System.out.println(length);
		node = head;
		for (int i = 0; i < length-1; i++) {
			node = node.next;
		}
		return node;
	}
}
