package Solved;

public class Solution889 {
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

    int[] pre, post;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        pre = preorder;
        post = postorder;
        int l = pre.length;
        return build(0, l, 0, l);
    }

    private TreeNode build(int pre1, int pre2, int post1, int post2){

        if (post2 - post1 == 0) return null;
        TreeNode top = new TreeNode(pre[pre1]);

        pre1 += 1;
        post2 -= 1;
        if (post2 - post1 == 0) return top;
        int post3 = post1;
        while(post[post3++] != pre[pre1]){}
        int pre3 = post3 - post1 + pre1;

        //System.out.println("left"+Arrays.toString(new int[]{pre1, pre3, post1, post3}));
        top.left = build(pre1, pre3, post1, post3);
        //System.out.println("right"+Arrays.toString(new int[]{pre3, pre2, post3, post2}));
        top.right = build(pre3, pre2, post3, post2);
        return top;
    }
}
