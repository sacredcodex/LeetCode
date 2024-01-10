package Solved;

public class Solution1022 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	int sum = 0;

	public int sumRootToLeaf(TreeNode root) {
		dfs(root, 0);
		return sum;
	}

	private void dfs(TreeNode node, int val){
		val = (val << 1) + node.val;
		if (node.left == null && node.right == null)
			sum += val;
		else {
			if (node.left != null)
				dfs(node.left, val);
			if (node.right != null)
				dfs(node.right, val);
		}
	}
}
