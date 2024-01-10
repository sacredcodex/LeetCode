package Solved;

public class Solution543 {
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

	public int diameterOfBinaryTree(TreeNode root) {
		int[] max = new int[]{0};
		height(root, max);
		return max[0];
	}
	private void height(TreeNode node, int[] max){
			int height = 0;
			int left = 0;
			int right = 0;
			if (node.left != null){
				height(node.left, max);
				height = node.left.val;
				left = node.left.val;
			}
			if (node.right != null){
				height(node.right, max);
				height = Math.max(height, node.right.val);
				right = node.right.val;
			}
			node.val = height + 1;
			max[0] = Math.max(max[0], left + right);
	}
}
