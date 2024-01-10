package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution637 {
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
	public List<Double> averageOfLevels(TreeNode root) {
		HashSet<TreeNode> level = new HashSet<>();
		level.add(root);
		List<Double> avg = new ArrayList<>();
		while(!level.isEmpty()){
			HashSet<TreeNode> next = new HashSet<>();
			double sum = 0;
			for (TreeNode node : level){
				sum += node.val;
				if (node.left != null)
					next.add(node.left);
				if (node.right != null)
					next.add(node.right);
			}
			avg.add(sum / level.size());
			level.clear();
			level = next;
		}
		return avg;
	}
}
