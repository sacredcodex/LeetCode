package Solved;

public class Solution101 {
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
	public boolean isSymmetric(TreeNode root) {
		boolean[] flag = new boolean[1];
		flag[0] = false;
		if (root.left == null && root.right == null) return true;
		else if (root.left == null || root.right == null) return false;
		else compare(root.left, root.right, flag);
		return !flag[0];
	}
	private void compare(TreeNode p, TreeNode q, boolean[] flag) {
		if (!flag[0]) {
			if (p == null && q == null) {

			}else if (p == null || q == null){
				flag[0] = true;
			}else if (p.val != q.val){
				flag[0] = true;
			}else {
				compare(p.left, q.right, flag);
				compare(p.right, q.left, flag);
			}
		}
	}
}
