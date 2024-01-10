package Solved;

public class Solution572 {
	public static class TreeNode {
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

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (isSame(root, subRoot))
			return true;
		else if (root.left != null && isSubtree(root.left, subRoot))
			return true;
		else return root.right != null && isSubtree(root.right, subRoot);
	}

	private static boolean isSame(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		if (!isSame(root1.left, root2.left))
			return false;
		return isSame(root1.right, root2.right);
	}

	public static void main(String[] args) {
		System.out.println(isSubtree(new TreeNode(1, new TreeNode(1), new TreeNode(1)), new TreeNode(1)));
	}
}
