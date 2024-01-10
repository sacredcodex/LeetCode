package Solved;

public class Solution606 {
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

	public String tree2str(TreeNode root) {
		if (root == null)
			return "";
		else return node2StringBuilder(root).toString();
	}

	private StringBuilder node2StringBuilder(TreeNode root) {
		if (root == null)
			return new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(root.val);
		if (root.left == null && root.right == null) {
		}
		else {
			if (root.left == null)
				stringBuilder.append("()");
			else {
				stringBuilder.append('(');
				stringBuilder.append(node2StringBuilder(root.left));
				stringBuilder.append(')');
			}
			if (root.right != null) {
				stringBuilder.append('(');
				stringBuilder.append(node2StringBuilder(root.right));
				stringBuilder.append(')');
			}
		}
		return stringBuilder;
	}
}
