package Solved;

public class Solution203 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode removeElements(ListNode head, int val) {
		while(head != null && head.val == val) head = head.next;
		if (head == null) return null;
		ListNode node = head;
		while(head.next != null) {
			if (head.next.val == val){
				head.next = head.next.next;
				if (head.next == null) break;
			}else{
				head = head.next;
			}
		}
		return node;
	}
}
