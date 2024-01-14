package Solved;

import java.util.ArrayList;
import java.util.List;


public class Solution230 {
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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        order(root, list);
        System.out.println(list.toString());
        return list.get(k);
    }

    public void order(TreeNode node, List<Integer> list){
        if (node == null)
            return;
        order(node.left, list);
        list.add(node.val);
        order(node.right, list);
    }
}
