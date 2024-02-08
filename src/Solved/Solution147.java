package Solved;

public class Solution147 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode last = head, curr = head.next;
        while (curr != null) {
            if (last.val <= curr.val) {
                last = last.next;
            } else {
                ListNode prev = dummyHead;
                while (prev.next.val <= curr.val) prev = prev.next;
                last.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = last.next;
        }
        return dummyHead.next;
    }
}
