package Solved;

public class Solution270 {
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

	int res = Integer.MAX_VALUE;
	double dis = Double.MAX_VALUE;

	public int closestValue(TreeNode root, double target) {
		dfs(root, target);
		return res;
	}

	private void dfs(TreeNode node, double target){
		double current = node.val - target;
		if (Math.abs(current) < dis) {
			res = node.val;
			dis = Math.abs(current);
		}
		if (current > 0 && node.left != null){
			dfs(node.left, target);
		}
		if (current < 0 && node.right != null){
			dfs(node.right, target);
		}
	}
}
