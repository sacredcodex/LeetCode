package Solved;

public class Solution445 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return reverseList(addTwoNumbers02(reverseList(l1), reverseList(l2)));
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers02(ListNode l1, ListNode l2) {
        ListNode sum;
        ListNode res = null;
        ListNode a1 = l1;
        ListNode a2 = l2;
        boolean bigger10 = false;
        sum = new ListNode(a1.val + a2.val);
        res = sum;
        if (sum.val >= 10){
            bigger10 = true;
            sum.val = sum.val - 10;
        }else bigger10 = false;
        while (a1.next != null || a2.next != null){
            if (a1.next != null)
                a1 = a1.next;
            else a1 = new ListNode(0);
            if (a2.next != null)
                a2 = a2.next;
            else a2 = new ListNode(0);
            sum.next = new ListNode(a1.val + a2.val);
            sum = sum.next;
            if (bigger10)
                sum.val++;
            if (sum.val >= 10){
                bigger10 = true;
                sum.val = sum.val - 10;
            }else bigger10 = false;
        }
        if (bigger10)
            sum.next = new ListNode(1);
        return res;
    }
}
