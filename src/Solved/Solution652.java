package Solved;

import java.util.*;

public class Solution652 {

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

	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		List<TreeNode> list = new ArrayList<>();
		dfs(root, list, 0);
		boolean[] booleans = new boolean[list.size()];
		Arrays.fill(booleans, true);
		List<TreeNode> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!booleans[i])
				continue;
			for (int j = i + 1; j < list.size(); j++) {
				if (!booleans[j])
					continue;
				if (compare(list.get(i), list.get(j))){
					booleans[i] = false;
					booleans[j] = false;
				}
			}
			if (!booleans[i])
				res.add(list.get(i));
		}
		return res;
	}

	private void dfs(TreeNode root, List<TreeNode> list, int height){
		if (root != null) {
			list.add(root);
			dfs(root.left, list, height + 1);
			dfs(root.right, list, height + 1);
		}

	}

	private boolean compare(TreeNode node1, TreeNode node2){
		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)
			return false;
		if (node1.val == node2.val){
			return compare(node1.left, node2.left) && compare(node1.right, node2.right);
		}else return false;
	}

}
