package Solved;

public class Solution111 {
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
	public int minDepth(TreeNode root) {
		if (root == null) return 0;
		int[] depth = new int[]{Integer.MAX_VALUE};
		depth(depth, root, 1);
		return depth[0];
	}
	private void depth(int[] depth, TreeNode node, int height){
		if (node.left != null)
			depth(depth, node.left, height+1);
		if (node.right != null)
			depth(depth, node.right, height+1);
		if (node.left == null && node.right == null)
			depth[0] = Math.min(depth[0], height);
	}

}
