package Solved;

import Template.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution508 {

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

	public int[] findFrequentTreeSum(TreeNode root) {
		dfs1(root);
		HashMap<Integer, Integer> map = new HashMap<>();
		dfs2(map, root);
		HashSet<Integer> set = new HashSet<>();
		int max = 0;
		for (Integer i : map.keySet()){
			if (map.get(i) > max){
				set.clear();
				set.add(i);
				max = map.get(i);
			}else if (map.get(i) == max){
				set.add(i);
			}
		}
		int[] nums = new int[set.size()];
		int i = 0;
		for (int num : set){
			nums[i++] = num;
		}
		return nums;
	}

	int dfs1(TreeNode node){
		if (node == null){
			return 0;
		}
		int left = dfs1(node.left);
		int right = dfs1(node.right);
		node.val = left + right + node.val;
		return node.val;
	}

	void dfs2(HashMap<Integer, Integer> map, TreeNode node){
		if (node == null)
			return;
		map.put(node.val, map.getOrDefault(node.val, 0) + 1);
		dfs2(map, node.left);
		dfs2(map, node.right);
	}


}
