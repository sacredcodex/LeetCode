package Solved;

public class Solution100 {
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
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean[] flag = new boolean[1];
		flag[0] = false;
		compare(p, q, flag);
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
				compare(p.left, q.left, flag);
				compare(p.right, q.right, flag);
			}
		}
	}
}
