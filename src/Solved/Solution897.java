package Solved;

public class Solution897 {
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

	public TreeNode increasingBST(TreeNode root) {
		TreeNode head = new TreeNode();
		TreeNode[] node = new TreeNode[]{head};
		dfs(root, node);
		return head.right;
	}

	private void dfs(TreeNode root, TreeNode[] node){
		if (root.left != null)
			dfs(root.left, node);
		node[0].right = new TreeNode(root.val);
		node[0] = node[0].right;
		if (root.right != null)
			dfs(root.right, node);
	}
}
