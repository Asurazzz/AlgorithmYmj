package com.test.str.test01.class06;


/**
 * @author : yemingjie
 * @date : 2021/7/15 23:28
 * 根据先序节点和中序节点求出二叉树
 * 测试链接：https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
public class Code05_ConstuctBinaryTreeFromPreorderAndInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length) {
            return null;
        }
        return f(pre, 0, pre.length-1, in, 0, in.length - 1);
    }

    /**
     * 有一棵树，先序结果是pre[L1...R1], 中序结果是in[L2...R2]
     * @param pre
     * @param L1
     * @param R1
     * @param in
     * @param L2
     * @param R2
     * @return
     */
    public static TreeNode f(int[] pre, int L1, int R1, int[] in, int L2, int R2) {
        if (L1 > R1) {
            return null;
        }
        TreeNode head = new TreeNode(pre[L1]);
        // 如果只有一个数，直接返回头节点
        if (L1 == R1) {
            return head;
        }
        int find = L2;
        // L1是先序遍历的头节点，在中序遍历中从L2也就是第一个开始找，找到头节点为止
//        for (;in[find] != pre[L1]; find++) { }
        while (in[find] != pre[L1]) {
            find++;
        }
        // 左树遍历, L2到find的位置就是左数的个数，和先序遍历左树的个数相等
        // 中序遍历的左数是从L2到find-1的位置
        head.left = f(pre, L1 + 1, L1+find-L2, in, L2, find - 1);

        head.right = f(pre, L1 + find -L2 + 1, R1, in, find + 1, R2);
        return head;

    }
}
