package com.test.str.test01.class06;


/**
 * @Classname Code04_MaximumDepthOfBinaryTree
 * @Description https://leetcode.com/problems/maximum-depth-of-binary-tree
 * @Date 2021/7/15 13:03
 * @Created by yemingjie
 */
public class Code04_MaximumDepthOfBinaryTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
    
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }



}
