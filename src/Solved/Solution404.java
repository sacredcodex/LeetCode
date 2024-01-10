package Solved;

public class Solution404 {
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
	public int sumOfLeftLeaves(TreeNode root) {
		int[] sum = new int[1];
		search(root, sum, false);
		return sum[0];
	}
	private void search(TreeNode treeNode, int[] sum, boolean left){
		if (treeNode.left != null) {
			search(treeNode.left, sum, true);
		}
		if (treeNode.right != null){
			search(treeNode.right, sum, false);
		}else if (left && treeNode.left == null){
			sum[0] += treeNode.val;
		}
	}
}
