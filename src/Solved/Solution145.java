package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution145 {
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
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root != null)
			add(list, root);
		return list;
	}

	private void add(List<Integer> list, TreeNode node){
		if (node.left != null)
			add(list, node.left);
		if (node.right != null)
			add(list, node.right);
		list.add(node.val);
	}
}
