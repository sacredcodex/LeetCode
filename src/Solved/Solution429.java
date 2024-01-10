package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution429 {
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
	};
	List<List<Integer>> res = new ArrayList<>();
	List<Node> list = new ArrayList<>();
	public List<List<Integer>> levelOrder(Node root) {
		if (root == null)
			return res;
		list.add(root);
		while (!list.isEmpty()){
			List<Integer> values = new ArrayList<>();
			List<Node> next = new ArrayList();
			for (Node node : list){
				values.add(node.val);
				next.addAll(node.children);
			}
			res.add(values);
			list = next;
		}
		return res;
	}
}
