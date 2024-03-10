package Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2583 {
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<>();
        if (root == null) return -1;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()){
            List<TreeNode> next = new ArrayList<>();
            Long sum = 0l;
            for (TreeNode node : list){
                sum += node.val;
                if (node.left!=null)
                    next.add(node.left);
                if (node.right!=null)
                    next.add(node.right);
            }
            res.add(sum);
            list = next;
        }
        if (res.size() < k) return -1;
        Collections.sort(res);
        return res.get(res.size()-k);
    }
}
