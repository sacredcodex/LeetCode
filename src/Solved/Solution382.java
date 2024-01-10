package Solved;

import java.util.ArrayList;
import java.util.Random;

public class Solution382 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	class Solution {

		ArrayList<Integer> list;

		public Solution(ListNode head) {
			list = new ArrayList<>();
			while(head != null){
				list.add(head.val);
				head = head.next;
			}
		}

		public int getRandom() {
			Random random = new Random();
			return list.get(random.nextInt(list.size()));
		}
	}
}
