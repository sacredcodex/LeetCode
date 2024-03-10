package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution107 {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()){
            List<TreeNode> next = new ArrayList<>();
            List<Integer> value = new ArrayList<>();
            for (TreeNode node : list){
                value.add(node.val);
                if (node.left!=null)
                    next.add(node.left);
                if (node.right!=null)
                    next.add(node.right);
            }
            res.add(value);
            list = next;
        }
        Collections.reverse(res);
        return res;
    }
}
