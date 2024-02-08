package Solved;

import java.util.HashSet;

public class Solution2641 {

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
    public TreeNode replaceValueInTree(TreeNode root) {
        int sum;
        HashSet<TreeNode> set = new HashSet<>();
        set.add(root);
        root.val = 0;
        while(!set.isEmpty()){
            sum = 0;
            HashSet<TreeNode> next = new HashSet<>();
            for (TreeNode node : set){
                if (node.left != null)
                    sum += node.left.val;
                if (node.right != null)
                    sum += node.right.val;
            }

            for (TreeNode node : set){
                int thisSum = 0;
                if (node.left != null)
                    thisSum += node.left.val;
                if (node.right != null)
                    thisSum += node.right.val;
                if (node.left != null){
                    node.left.val = sum - thisSum;
                    next.add(node.left);
                }
                if (node.right != null){
                    node.right.val = sum - thisSum;
                    next.add(node.right);
                }
            }

            set = next;
        }

        return root;
    }
}
