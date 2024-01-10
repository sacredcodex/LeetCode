package Solved;

public class Solution112 {
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

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) return false;
		boolean[] flag = new boolean[1];
		flag[0] = false;
		find(root, targetSum, flag);
		return flag[0];
	}
	private void find(TreeNode node, int target, boolean[] flag){
		if (flag[0]) return;
		else {
			if (node.left != null) {
				node.left.val += node.val;
				find(node.left, target, flag);
			}
			if (node.right != null) {
				node.right.val += node.val;
				find(node.right, target, flag);
			}
			if (node.left == null && node.right == null && node.val == target){
				flag[0] = true;
			}
		}
	}
}
