package Offer;

public class Offer35 {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		if (head == null) return null;
		Node next1 = head.next;
		Node head2 = new Node(head.val);
		Node next2 = head2.next;
		while (next1 != null) {
			next2 = new Node(next1.val);
			next1 = next1.next;
			next2 = next2.next;
		}
		next1 = head;
		next2 = head2;
		//while (next1 != null)
		return null;
	}
}
