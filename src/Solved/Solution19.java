package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
	public class ListNode {
		int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
	public ListNode removeNthFromEnd(ListNode head, int n) {
		List<ListNode> listNodeList = new ArrayList<>();
		while(head != null){
			listNodeList.add(head);
			head = head.next;
		}
		if (listNodeList.size() == 1)
			return null;
		if (listNodeList.size() == n)
			return listNodeList.get(1);
		else if (n == 1)
			listNodeList.get(listNodeList.size()-2).next = null;
		else
			listNodeList.get(listNodeList.size()-n-1).next = listNodeList.get(listNodeList.size()-n+1);
		return listNodeList.get(0);
	}
}
