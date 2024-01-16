package LCR;

public class Solution140 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode trainingPlan(ListNode head, int cnt) {
        int length = 0;
        ListNode node = head;
        while(node != null){
            length += 1;
            node = node.next;
        }
        node = head;
        for (int i = 0; i < length - cnt; i++) {
            node = node.next;
        }
        return node;
    }
}
