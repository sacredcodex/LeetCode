package Solved;

public class Solution998 {

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

	public TreeNode insertIntoMaxTree(TreeNode root, int val) {
		TreeNode node = root;
		if (node.val < val)
			return new TreeNode(val, root, null);
		while(node.right != null){
			if (node.right.val < val) {
				node.right = new TreeNode(val, node.right, null);
				return root;
			}
			else node = node.right;
		}
		node.right = new TreeNode(val);
		return root;
	}
}
