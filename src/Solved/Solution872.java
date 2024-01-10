package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution872 {
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

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = toList(root1);
		List<Integer> list2 = toList(root2);
		int length = list1.size();
		if (list2.size() != length) return false;
		for (int i = 0; i < length; i++) {
			if (!list1.get(i).equals(list2.get(i)))
				return false;
		}
		return true;
	}
	private List<Integer> toList(TreeNode root){
		List<Integer> res = new ArrayList<>();
		dfs(res, root);
		return res;
	}
	private void dfs(List<Integer> list, TreeNode node){
		if (node.left == null && node.right == null){
			list.add(node.val);
		}
		if (node.left != null)
			dfs(list, node.left);
		if (node.right != null)
			dfs(list, node.right);
	}
}
