package Template;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode<T extends Comparable<T>> {

	public T val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(T element){
		this.val = element;
	}

	TreeNode(T element, TreeNode left, TreeNode right){
		this.val = element;
		this.left = left;
		this.right = right;
	}

	public TreeNode find(T element){
		TreeNode result;
		if (this.val == element)
			return this;
		if (this.left != null){
			result = this.left.find(element);
			if (result != null)
				return result;
		}
		if (this.right != null){
			result = this.right.find(element);
			if (result != null)
				return result;
		}
		return null;
	}

	public String toString(int format){
		StringBuilder stringBuilder = new StringBuilder();
		print(stringBuilder, 1, this, format);
		System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
	}

	private void print(StringBuilder stringBuilder, int path, TreeNode<T> node, int format){
		int copyPath = path;
		if ((path & 1) == 1) {
			Stack<Integer> stack = new Stack<>();
			while (copyPath > 1) {
				stack.push(copyPath & 1);
				copyPath >>= 1;
			}
			while (!stack.isEmpty()) {
				stringBuilder.append(" ".repeat(format));
				stringBuilder.append(stack.pop() == 0 ? '│' : "");
			}
			if (path > 1)
				stringBuilder.append('└');
		}
		String value = node.val.toString();
		if (value.length() < format){
			value = value + " ".repeat(format - value.length());
		}
		stringBuilder.append(value.substring(0,format));
		if (node.left == null && node.right == null){
			stringBuilder.append('\n');
			return;
		}
		if (node.left == null){
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			stringBuilder.append("┐\n");
			print(stringBuilder, (path << 1) + 1, node.right, format);
		}else {
			if (node.right == null){
				stringBuilder.append('─');
				print(stringBuilder, path << 1, node.left, format);
			}else {
				stringBuilder.append('┬');
				print(stringBuilder, path << 1, node.left, format);
				print(stringBuilder, (path << 1) + 1, node.right, format);
			}
		}


	}

	public static void main(String[] args) {
		TreeNode<Integer> head = new TreeNode<>(13, new TreeNode(10,new TreeNode(7), new TreeNode(12)), new TreeNode(15, null, new TreeNode(16)));
		head.toString(3);
	}
}
