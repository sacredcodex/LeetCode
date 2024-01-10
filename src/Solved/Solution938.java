package Solved;

public class Solution938 {
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

	int sum;
	int low, high;

	public int rangeSumBST(TreeNode root, int low, int high) {
		sum = 0;
		this.low = low;
		this.high = high;
		dfs(root);
		return sum;
	}
	private void dfs(TreeNode node){
		if (node.val >= low && node.val <= high){
			sum += node.val;
		}
		if (node.left != null) dfs(node.left);
		if (node.right != null) dfs(node.right);
	}
}
