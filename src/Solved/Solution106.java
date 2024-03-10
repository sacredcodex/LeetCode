package Solved;

import java.util.Stack;

public class Solution106 {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        Stack<TreeNode> top = new Stack<>();
        int inidx = inorder.length - 1;
        int postidx = postorder.length - 1;
        boolean right = true;

        TreeNode root = new TreeNode(postorder[postidx--]);
        top.add(root);
        TreeNode pre = null;

        while(postidx >= 0 && inidx >= 0){
            if (!top.isEmpty() && inorder[inidx] == top.peek().val){
                pre = top.pop();
                right = false;
                inidx -= 1;
            }else {
                if (right){
                    top.peek().right = new TreeNode(postorder[postidx--]);
                    top.add(top.peek().right);
                }else {
                    pre.left = new TreeNode(postorder[postidx--]);
                    top.add(pre.left);
                    right = true;
                }
            }
        }
        return root;
    }
}
