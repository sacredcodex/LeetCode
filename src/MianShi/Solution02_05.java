package MianShi;

public class Solution02_05 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;

        int add = 0;
        while(l1 != null || l2!= null){
            int cur = add;
            add = 0;
            if (l1 != null) {
                cur += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cur += l2.val;
                l2 = l2.next;
            }
            if (cur >= 10) {
                cur -= 10;
                add = 1;
            }
            head.next = new ListNode(cur);
            head = head.next;
        }
        if (add == 1)
            head.next = new ListNode(1);
        return res.next;
    }
}
