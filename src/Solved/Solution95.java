package Solved;

import java.util.*;

public class Solution95 {
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

	static class Tree{

		TreeNode root = null;

		Tree(){}

		void insert(int val){
			TreeNode target = root;
			while(target != null)
				if (target.val < val){
					target = target.right;
				}else {
					target = target.left;
				}
			if (target == null)
				target = new TreeNode(val);
		}

		void insertAll(List<Integer> list){
			for(Integer i : list){
				this.insert(i);
			}
		}

		void print(TreeNode node){
			if (node!=null) {
				print(node.left);
				System.out.print(node.val+",");
				print(node.right);
			}
			System.out.println();
		}
	}

	private static boolean equals(TreeNode one, TreeNode two) {
		if (one == null && two == null)
			return true;
		if (one == null || two == null)
			return false;
		if (one.val != two.val)
			return false;
		return equals(one.left, two.left) && equals(one.right, two.right);
	}

	public List<TreeNode> generateTrees(int n) {
		List<Integer> integerList = new ArrayList<>();
		List<Tree> treeList = new ArrayList<>();
		int state = 0;
		dfs(integerList, treeList, state, n);
		System.out.println(treeList.size());
		List<TreeNode> res = new ArrayList<>();
		for (Tree tree : treeList){
			tree.print(tree.root);
			boolean contain = false;
			for (TreeNode treeNode : res){
				if (equals(treeNode, tree.root)){
					contain = true;
					break;
				}
			}
			if (!contain)
				res.add(tree.root);
		}
		System.out.println(res.size());
		return res;
	}
	
	private void dfs(List<Integer> integerList, List<Tree> treeList, int state, int n){
		if (integerList.size() == n) {
			Tree tree = new Tree();
			tree.insertAll(integerList);
			treeList.add(tree);
		} else {
			for (int i = 1; i <= n; i++) {
				if (getState(state, i)) {
					integerList.add(i);
					dfs(integerList, treeList, setState(state, i), n);
					integerList.remove(integerList.size() - 1);
				}
			}
		}
	}
	
	private boolean getState(int state, int i){
		for (int j = 1; j < i; j++) {
			state >>= 1;
		}
		return (state & 1) == 0;
	}
	
	private int setState(int state, int i){
		int tmp = 1;
		for (int j = 1; j < i; j++) {
			tmp <<= 1;
		}
		return state | tmp;
	}

	public static void main(String[] args) {
		Solution95 solution95 = new Solution95();
		Tree tree = new Tree();
		tree.insertAll(List.of(1,2,3));
		tree.print(tree.root);
		new Solution95().generateTrees(3);
	}
}
