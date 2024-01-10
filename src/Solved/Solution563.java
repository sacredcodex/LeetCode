package Solved;

public class Solution563 {

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

	private static int sum = 0;

	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		sum = 0;
		sum(root);
		return sum;
	}

	private int sum(TreeNode node) {
		int leftSum = 0;
		int rightSum = 0;
		if (node.left != null)
			leftSum = sum(node.left);
		if (node.right != null)
			rightSum = sum(node.right);
		int grad = Math.abs(leftSum-rightSum);
		sum += grad;
		return leftSum + rightSum + node.val;
	}
}
