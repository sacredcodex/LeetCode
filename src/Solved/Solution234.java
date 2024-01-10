package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while(head != null){
			list.add(head.val);
			head = head.next;
		}
		int i1 = 0;
		int i2 = list.size()-1;
		while (i1<i2){
			if (!list.get(i1++).equals(list.get(i2--)))
				return false;
		}
		return true;
	}
}
