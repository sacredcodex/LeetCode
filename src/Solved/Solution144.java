package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {
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
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root != null)
			add(list, root);
		return list;
	}

	private void add(List<Integer> list, TreeNode node){
		list.add(node.val);
		if (node.left != null)
			add(list, node.left);
		if (node.right != null)
			add(list, node.right);
	}
}
