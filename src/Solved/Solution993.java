package Solved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
}
