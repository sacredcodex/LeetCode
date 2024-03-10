package Solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution199 {
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
    HashMap<Integer, Integer> map;
    public List<Integer> rightSideView1(TreeNode root) {
        map = new HashMap<>();
        dfs1(root, 0);
        int length = map.keySet().size();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            res.add(map.get(i));
        }
        return res;
    }

    private void dfs1(TreeNode node, int height){
        if (node == null) return;
        map.put(height, node.val);
        dfs1(node.left, height+1);
        dfs1(node.right, height+1);
    }

    List<Integer> res;
    public List<Integer> rightSideView2(TreeNode root) {
        res = new ArrayList<>();
        dfs2(root, 0);
        return res;
    }

    private void dfs2(TreeNode node, int height){
        if (node == null) return;
        if (height == res.size()){
            res.add(node.val);
        }
        dfs2(node.right, height+1);
        dfs2(node.left, height+1);
    }

}
