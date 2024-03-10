package Solved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(-1);
        ListNode pointer = res;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode listNode : lists)
            if (listNode!=null)
                priorityQueue.offer(listNode);

        while (!priorityQueue.isEmpty()){
            pointer.next = priorityQueue.poll();
            pointer = pointer.next;
            if (pointer.next != null)
                priorityQueue.offer(pointer.next);
        }
        return res.next;
    }
}
