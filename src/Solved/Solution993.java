package Solved;

import java.util.*;

public class Solution993 {
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

	public boolean isCousins(TreeNode root, int x, int y) {
		List<TreeNode> list = new ArrayList<>();
		if (root.val == x || root.val == y) return false;
		list.add(root);
		while (!list.isEmpty()){
			List<TreeNode> treeNodes = new ArrayList<>();
			for (TreeNode node : list){
				if (node.left != null) treeNodes.add(node.left);
				if (node.right != null) treeNodes.add(node.right);
			}
			boolean containX = false;
			boolean containY = false;
			for (TreeNode node : treeNodes){
				if (node.val == x) containX = true;
				if (node.val == y) containY = true;
			}
			if (containX && containY) {
				for (TreeNode node : list) {
					if (node.left != null && node.right != null) {
						int left = node.left.val;
						int right = node.right.val;
						if ((left == x && right == y) || (left == y && right == x))
							return false;
					}
				}
				return true;
			}
			if (containX || containY)
				return false;
			list.clear();
			list = treeNodes;
		}
		return false;
	}

	public boolean isCousins1(TreeNode root, int x, int y) {
		HashSet<TreeNode> set = new HashSet<>();
		set.add(root);
		while (!set.isEmpty()){
			HashSet<TreeNode> next = new HashSet<>();
			HashSet<Integer> values = new HashSet<>();
			for (TreeNode node : set){
				if (node.left != null) {
					next.add(node.left);
					values.add(node.left.val);
				}
				if (node.right != null){
					next.add(node.right);
					values.add(node.right.val);
				}
			}
			if (values.contains(x) && values.contains(y)){
				for (TreeNode node : set)
					if (node.left != null && node.right != null){
						if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x))
							return false;
					}
				return true;
			}
			if (values.contains(x) || values.contains(y))
				return false;
			set = next;
		}
		return false;
	}
}
