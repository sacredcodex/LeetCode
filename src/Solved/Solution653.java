package Solved;

import java.util.LinkedList;
import java.util.Queue;

public class Solution653 {
	public class TreeNode {
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

	public boolean findTarget(TreeNode root, int k) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()){
			TreeNode node = queue.poll();
			int target = k - node.val;
			if (node.val != target && search(root, target))
				return true;
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}
		return false;
	}

	private boolean search(TreeNode node, int target) {
		if (node == null)
			return false;
		int val = node.val;
		if (val == target)
			return true;
		if (val > target)
			return search(node.left, target);
		else return search(node.right, target);
	}
}
