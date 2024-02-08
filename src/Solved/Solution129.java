package Solved;

public class Solution129 {

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
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int num){
        num = num *10 + node.val;
        if (node.left == null && node.right == null)
            sum += num;
        if (node.left != null)
            dfs(node.left, num);
        if (node.right != null)
            dfs(node.right, num);
    }
}
