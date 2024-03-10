package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution236 {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        List<TreeNode> path = new ArrayList<>();
        dfs(root, p, pathP, path);
        path.clear();
        dfs(root, q, pathQ, path);
        int idx = 0;

        for (TreeNode n : pathP)
            System.out.println(n.val);

        while(idx < pathP.size() && idx < pathQ.size() && pathP.get(idx) == pathQ.get(idx)){idx+=1;}
        return pathP.get(idx-1);
    }

    private void dfs(TreeNode root, TreeNode node, List<TreeNode> path, List<TreeNode> tmp){
        if (node == null) return;
        if (!path.isEmpty()) return;
        tmp.add(root);
        if (root == node)
            path.addAll(tmp);

        dfs(root.left, node, path, tmp);
        dfs(root.right, node, path, tmp);

        tmp.remove(tmp.size()-1);
    }
}
