package Solved;

public class Solution222 {
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
    int count = 0;
    public int countNodes(TreeNode root) {
        count(root);
        return count;
    }

    private void count(TreeNode node){
        if (node!=null){
            count += 1;
            count(node.left);
            count(node.right);
        }
    }
}
