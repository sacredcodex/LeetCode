package Solved;

public class Solution654 {

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

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return constructMaximumBinaryTree(nums, 0, nums.length);
	}

	public TreeNode constructMaximumBinaryTree(int[] nums, int begin, int end) {
		int index = -1;
		int max = -1;
		for (int i = begin; i < end; i++) {
			if (nums[i] > max){
				max = nums[i];
				index = i;
			}
		}
		if (max == -1)
			return null;
		return new TreeNode(max, constructMaximumBinaryTree(nums, begin, index), constructMaximumBinaryTree(nums, index + 1, end));
	}



}
