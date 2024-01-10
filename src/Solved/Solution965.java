package Solved;

public class Solution965 {
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

	public boolean isUnivalTree(TreeNode root) {
		if (root.left != null && root.left.val != root.val) return false;
		if (root.right != null && root.right.val != root.val) return false;
		if (root.left != null && root.right != null) return isUnivalTree(root.left) && isUnivalTree(root.right);
		if (root.left != null) return isUnivalTree(root.left);
		if (root.right != null) return isUnivalTree(root.right);
		return true;
	}
}
