package Solved;

public class Solution25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node1 = new ListNode(-1, head);
        ListNode node = node1;

        while (head != null){
            ListNode tail = node;

            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null)
                    return node1.next;
            }

            ListNode end = tail.next;

            myReverse(head, tail);

            node.next = tail;
            head.next = end;
            node = head;
            head = head.next;
        }

        return node1.next;
    }

    public void myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
    }

}
