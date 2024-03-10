package Solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution987 {
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

    List<int[]> pos = new ArrayList<>();
    List<TreeNode> nodes = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        int n = pos.size();
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2]!=o2[2]) return o1[2]-o2[2];
                if (o1[1]!=o2[1]) return o1[1]-o2[1];

                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < n; i++) {
            int[] ints = pos.get(i);
            queue.offer(new int[]{nodes.get(i).val, ints[0], ints[1]});
        }
        List<List<Integer>> res = new ArrayList<>();
        int cur = Integer.MIN_VALUE;
        List<Integer> pointer = null;
        while (!queue.isEmpty()){
            int[] ints = queue.poll();
            if (cur != ints[2]){
                pointer = new ArrayList<>();
                res.add(pointer);
                cur = ints[2];
            }
            pointer.add(ints[0]);
        }
        return res;
    }

    private void dfs(TreeNode node, int row, int col){
        if (node == null) return;
        nodes.add(node);
        pos.add(new int[]{row, col});
        dfs(node.left, row+1, col-1);
        dfs(node.right, row+1, col+1);
    }
}
