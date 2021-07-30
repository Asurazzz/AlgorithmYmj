package com.test.str.test01.class07;


/**
 * 测试地址：https://leetcode.com/problems/path-sum
 * 能否组成路径和？
 * @author : yemingjie
 * @date : 2021/7/20 23:10
 */
public class Code03_PathSum {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSum = false;

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        isSum = false;
        process(root, 0, sum);
        return isSum;
    }

    private static void process(TreeNode root, int preSum, int sum) {
        if (root.left == null && root.right == null) {
            if (root.val + preSum == sum) {
                isSum = true;
            }
            return;
        }
        // root是非叶节点
        preSum += root.val;
        if (root.left != null) {
            process(root.left, preSum, sum);
        }
        if (root.right != null) {
            process(root.right, preSum, sum);
        }
    }


}
