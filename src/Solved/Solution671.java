package Solved;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Solution671 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static int findSecondMinimumValue(TreeNode root) {
		int first = root.val;
		int second = root.val;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()){
			TreeNode node = queue.poll();
			if (node.val > first){
				if (second == first || node.val < second)
					second = node.val;
			}
			if (second != first && node.val >= second) continue;
			if (node.left != null) {
				queue.offer(node.left);
				queue.offer(node.right);
			}
		}
		if (second == first) return -1;
		return second;
	}
}
