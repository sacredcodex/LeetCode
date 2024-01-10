package Solved;

public class Solution21 {
	public class ListNode {
		int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode(-1);
		ListNode next = head;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				next.next = list1;
				next = next.next;
				list1 = list1.next;
			}else {
				next.next = list2;
				next = next.next;
				list2 = list2.next;
			}
		}
		next.next = list1 == null ? list2 : list1;
		return head.next;
	}
}
