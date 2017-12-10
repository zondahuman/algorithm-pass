package com.abin.lee.algorithm.pass.lintcode.bst.depth;

/**
 * Created by abin on 2017/12/10 2017/12/10.
 * algorithm-pass
 * com.abin.lee.algorithm.pass.lintcode.bst.depth
 * LintCode-155. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 二叉树的最小深度为根节点到最近叶子节点的距离。
 http://blog.csdn.net/skp127/article/details/51654916
 */
public class BstMinmumDepth {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        treeNode1.left = new TreeNode(15);
        treeNode1.right = new TreeNode(7);
        root.right = treeNode1;
        Integer result = minDepth(root);
        System.out.println("result=" + result);
    }

    /**
     * 因为是判断最小深度，所以必须增加一个叶子的判断
     （因为如果一个节点如果只有左子树或者右子树，我们不能取它左右子树中小的作为深度，因为那样会是0，
     我们只有在叶子节点才能判断深度，而在求最大深度的时候，因为一定会取大的那个，所以不会有这个问题）。
     * @param root
     * @return
     */
    public static int minDepth(TreeNode root){
        if(root==null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return minDepth(root.left)+1;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

    /**
     * Definition of TreeNode:
     */
    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
