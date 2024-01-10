package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution501 {
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

	public int[] findMode(TreeNode root) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		all(root, hashMap);
		List<Integer> list = new ArrayList<>();
		int number = 0;
		for (int key : hashMap.keySet()){
			if (hashMap.get(key) > number){
				list.clear();
				list.add(key);
				number = hashMap.get(key);
			}else if (hashMap.get(key) == number)
				list.add(key);
		}
		int[] res = new int[list.size()];
		int index = 0;
		for (int e : list){
			res[index++] = e;
		}
		return res;
	}
	private void all(TreeNode node, HashMap<Integer,Integer> hashMap){
		hashMap.put(node.val, hashMap.getOrDefault(node.val, 0) + 1);
		if (node.left != null)
			all(node.left, hashMap);
		if (node.right != null)
			all(node.right, hashMap);
	}
}
