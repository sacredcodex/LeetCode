package Solved;

public class Solution160 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode l1=headA, l2=headB;
		while(l1 != l2){
			l1 = l1.next;
			l2 = l2.next;
			if (l1 == null && l2 ==null)
				return null;
			if (l1 == null)
				l1 = headB;
			if (l2 == null)
				l2 = headA;
		}
		return l1;
	}
}
