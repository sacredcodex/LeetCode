package Solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution2049 {
	class TreeNode{
		int id;
		int score;
		TreeNode[] nodes;
		int children = 0;
		TreeNode(int id){this.id = id; nodes = new TreeNode[2];}
	}
	int n;
	long max = 0;
	int count = 0;
	boolean[] calculate;
	public int countHighestScoreNodes(int[] parents) {
		TreeNode head = new TreeNode(-1);
		n = parents.length;
		calculate = new boolean[n];
		Arrays.fill(calculate, false);

		HashMap<Integer, TreeNode> nodeMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			nodeMap.put(i, new TreeNode(i));
		}
		for (int i = 0; i < n; i++) {
			if (parents[i] == -1)
				head = nodeMap.get(i);
			else {
				TreeNode parent = nodeMap.get(parents[i]);
				parent.nodes[parent.children++] = nodeMap.get(i);
			}
		}
		search(head);
		return count;
	}
	private int search(TreeNode node){
		if (!calculate[node.id]) {
			if (node.children == 0) {
				node.score = 1;
				long score = n - 1;
				if (score > max){
					max = score;
					count = 1;
				}else if (score == max){
					count += 1;
				}
			} else if (node.children == 1) {
				int child = search(node.nodes[0]);
				node.score = 1 + child;
				long score = (long) child * (n - 1 - child);
				if (n - 1 - child == 0)
					score = child;
				if (score > max){
					max = score;
					count = 1;
				}else if (score == max){
					count += 1;
				}
			} else if (node.children == 2) {
				int left = search(node.nodes[0]);
				int right = search(node.nodes[1]);
				node.score = 1 + left + right;
				long score = (long) left * right * (n - 1 - left - right);
				if (n - 1 - left - right == 0)
					score = (long) left * right;
				if (score > max){
					max = score;
					count = 1;
				}else if (score == max){
					count += 1;
				}
			}
			calculate[node.id] = true;
		}
		return node.score;
	}
}
