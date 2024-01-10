package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution589 {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root != null)
			dfs(root, list);
		return list;
	}

	private void dfs(Node node, List<Integer> list){
		list.add(node.val);
		for (Node node1 : node.children)
			dfs(node1, list);
	}
}
