package Solved;

import Template.TreeNode;

public class Solution124 {
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

	int res = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		dfs(root);
		return res;
	}

	private int dfs(TreeNode node){
		if (node == null) return 0;
		int left = dfs(node.left);
		int right = dfs(node.right);
		int pathSum = Math.max(left, 0) + Math.max(right, 0) + node.val;
		if (pathSum > res)
			res = pathSum;
		return node.val + Math.max(Math.max(left, right), 0);
	}
}
