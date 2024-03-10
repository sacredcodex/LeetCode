package Solved;

import java.util.HashSet;

public class Solution99 {
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

    TreeNode last;
    TreeNode tmp;
    TreeNode tmpNext;
    public void recoverTree(TreeNode root) {
        last = new TreeNode(Integer.MIN_VALUE);
        dfs1(root);
        int val = tmp.val;
        tmp.val = tmpNext.val;
        tmpNext.val = val;
    }

    private void dfs1(TreeNode node){
        if (node.left != null)
            dfs1(node.left);

        if (tmp == null){
            if (last.val > node.val)
                tmp = last;
        }
        if (tmp != null){
            if (last.val > node.val)
                tmpNext = node;
        }

        last = node;

        if (node.right!=null)
            dfs1(node.right);
    }
}
