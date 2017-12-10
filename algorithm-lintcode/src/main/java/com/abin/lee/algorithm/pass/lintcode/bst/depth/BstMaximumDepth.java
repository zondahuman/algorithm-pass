package com.abin.lee.algorithm.pass.lintcode.bst.depth;

/**
 * Created by abin on 2017/12/10 2017/12/10.
 * algorithm-pass
 * com.abin.lee.algorithm.pass.lintcode.bst.depth
 * LintCode-97.二叉树的最大深度
 给定一个二叉树，找出其最大深度。
 二叉树的深度为根节点到最远叶子节点的距离。
 https://www.cnblogs.com/libaoquan/p/6807992.html
 */
public class BstMaximumDepth {
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
        Integer result = maxDepth(root);
        System.out.println("result=" + result);
    }


    public static int maxDepth(TreeNode root){
        if(null == root)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
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
