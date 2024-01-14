package Solved;

import java.util.Arrays;

public class Solution82 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode left = new ListNode();
        left.next = head;
        ListNode pointer = left;
        while(pointer.next != null && pointer.next.next != null){
            if (pointer.next.val == pointer.next.next.val){
                int val = pointer.next.val;
                while(pointer.next != null && pointer.next.val == val)
                    pointer.next = pointer.next.next;
            }else
                pointer = pointer.next;
            print(left.next);
        }
        return left.next;
    }

    public static void print(ListNode head){
        ListNode copy = new ListNode();
        copy.val = head.val;
        copy.next = head.next;
        while(copy != null){
            System.out.print(copy.val+" ");
            copy = copy.next;
        }
    }
    public static void main(String[] args) {
        ListNode test = new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4)))));
        ListNode result = deleteDuplicates(test);
        print(result);
    }
}
