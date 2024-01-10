package Solved;

public class Solution110 {
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

	public boolean isBalanced(TreeNode root) {
		if (root == null) return true;
		boolean[] flag = new boolean[1];
		flag[0] = true;
		height(root, flag);
		return flag[0];
	}
	private int height(TreeNode treeNode, boolean[] flag){
		if (flag[0]){
			int left;
			if (treeNode.left == null)
				left = 0;
			else left = height(treeNode.left, flag);
			int right;
			if (treeNode.right == null)
				right = 0;
			else right = height(treeNode.right, flag);
			if (Math.abs(left - right) > 1)
				flag[0] = false;
			return Math.max(left, right) + 1;
		}
		return -1;
	}
}
