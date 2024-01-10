package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1609 {
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

	public static boolean isEvenOddTree(TreeNode root) {
		List<TreeNode> now = new ArrayList<>();
		List<TreeNode> next = new ArrayList<>();
		next.add(root);
		boolean odd = false;
		while (!next.isEmpty()) {
			for (int i = 0; i < next.size(); i++) {
				if (next.get(i).val % 2 == 1 == odd) return false;
				if (i > 0 && next.get(i).val > next.get(i-1).val == odd) return false;
				if (i > 0 && next.get(i).val == next.get(i-1).val) return false; // strictly
				now.add(next.get(i));
			}
			next.clear();
			for (TreeNode e : now) {
				if (e.left != null)
					next.add(e.left);
				if (e.right != null)
					next.add(e.right);
			}
			now.clear();
			odd = !odd;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isEvenOddTree(new TreeNode(1,new TreeNode(10), new TreeNode(4))));
	}
}
