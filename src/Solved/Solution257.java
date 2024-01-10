package Solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution257 {
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
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		search(res, arrayList, root);
		System.out.println(res.size());
		return res;
	}
	private static void search(List<String> list, ArrayList<Integer> arrayList, TreeNode treeNode){
		if (treeNode != null) {
			arrayList.add(treeNode.val);
			if (treeNode.left != null){
				search(list, arrayList, treeNode.left);
			}
			if (treeNode.right != null){
				search(list, arrayList, treeNode.right);
			}
			if (treeNode.left == null && treeNode.right == null) {
				list.add(toString(arrayList));
			}
			arrayList.remove(arrayList.size()-1);
		}
	}
	private static String toString(ArrayList<Integer> arrayList){
		if (arrayList.isEmpty()) return "";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(arrayList.get(0));
		for (int i = 1; i < arrayList.size(); i++) {
			stringBuilder.append("->");
			stringBuilder.append(arrayList.get(i));
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		System.out.println(binaryTreePaths(root));
	}
}
