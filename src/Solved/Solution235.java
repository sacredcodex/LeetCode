package Solved;

public class Solution235 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (p.val > q.val){
			TreeNode treeNode = p;
			p = q;
			q = treeNode;
		}
		while(root.val != q.val && root.val != p.val){
			if (p.val < root.val && q.val < root.val)
				root = root.left;
			else if (p.val > root.val && q.val > root.val)
				root = root.right;
			else return root;
		}
		return root;
	}
}
