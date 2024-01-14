package Solved;

import Solved.Solution222;

import java.util.ArrayList;
import java.util.List;

public class Solution98 {
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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        order(root, list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) >= list.get(i+1))
                return false;
        }
        return true;
    }

    public void order(TreeNode node, List<Integer> list){
        if (node == null)
            return;
        order(node.left, list);
        list.add(node.val);
        order(node.right, list);
    }
}
