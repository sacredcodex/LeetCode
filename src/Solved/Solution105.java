package Solved;

import java.util.Arrays;

public class Solution105 {
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
    int[] pre, in;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in = inorder;
        int l = preorder.length;
        return build(0, l, 0, l);
    }

    private TreeNode build(int pl, int pr, int il, int ir){
        if (pr-pl == 0) return null;
        TreeNode res = new TreeNode(pre[pl]);
        int idx = il;
        while(in[idx] != pre[pl]){
            idx += 1;
        }
        res.left = build(pl+1, pl+1+idx-il, il, idx);
        res.right = build(pl+1+idx-il, pr, idx+1, ir);
        return res;
    }
}
