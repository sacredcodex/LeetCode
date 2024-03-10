package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution2476 {
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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        Integer[] ints = new Integer[list.size()];
        list.toArray(ints);
        List<List<Integer>> res = new ArrayList<>();
        for (Integer query : queries){
            int idx = Arrays.binarySearch(ints, query);
            List<Integer> add = new ArrayList<>();
            if (idx >= 0){
                add.add(query);
                add.add(query);
                res.add(add);
            }else {
                idx = -idx - 1;
                if (idx == 0)
                    add.add(-1);
                else
                    add.add(ints[idx-1]);
                if (idx == ints.length)
                    add.add(-1);
                else
                    add.add(ints[idx]);
                res.add(add);
            }
        }
        return res;
    }

    private void dfs(TreeNode node, List<Integer> list){
        if (node != null) {
            dfs(node.left, list);
            list.add(node.val);
            dfs(node.right, list);
        }
    }
}
