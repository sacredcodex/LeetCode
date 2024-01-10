package Solved;

public class Solution108 {
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

	public TreeNode sortedArrayToBST(int[] nums) {
		return toTree(nums, 0, nums.length - 1);
	}
	private TreeNode toTree(int[] nums, int begin, int end){
		if (begin > end) return null;
		int index = begin + end;
		index >>= 1;
		TreeNode node = new TreeNode(nums[index]);
		node.left = toTree(nums, begin, index - 1);
		node.right = toTree(nums, index + 1, end);
		return node;
	}
}
