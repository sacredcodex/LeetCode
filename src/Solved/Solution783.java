package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution783 {
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
	public int minDiffInBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root != null)
			add(list, root);
		Collections.sort(list);
		int dif = Integer.MAX_VALUE;
		for (int i = 1; i < list.size(); i++) {
			dif = Math.min(dif, list.get(i) - list.get(i-1));
		}
		return dif;
	}

	private void add(List<Integer> list, TreeNode node){
		list.add(node.val);
		if (node.left != null)
			add(list, node.left);
		if (node.right != null)
			add(list, node.right);
	}
}
