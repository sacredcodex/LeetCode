package Offer;

public class Offer24 {
	public class ListNode {
		int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
	public ListNode reverseList(ListNode head) {
		ListNode last = null, node = head;
		while (node != null){
			ListNode next = node.next;
			node.next = last;
			last = node;
			node = next;
		}
		return last;
	}
}
