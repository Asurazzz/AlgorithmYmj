package com.test.str.test01.class06;


import java.util.HashMap;

/**
 * @author : yemingjie
 * @date : 2021/7/15 23:28
 * 根据先序节点和中序节点求出二叉树
 * 测试链接：https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
public class Code05_ConstuctBinaryTreeFromPreorderAndInorderTraversal2 {

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
        HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            valueIndexMap.put(in[i], i);
        }
        return g(pre, 0, pre.length-1, in, 0, in.length - 1, valueIndexMap);
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
    public static TreeNode g(int[] pre, int L1, int R1, int[] in, int L2, int R2,
                             HashMap<Integer, Integer> valueIndexMap) {
        if (L1 > R1) {
            return null;
        }
        TreeNode head = new TreeNode(pre[L1]);
        if (L1 == R1) {
            return head;
        }
        int find = valueIndexMap.get(pre[L1]);
        while (in[find] != pre[L1]) {
            find++;
        }
        // 左树遍历, L2到find的位置就是左数的个数，和先序遍历左树的个数相等
        // 中序遍历的左数是从L2到find-1的位置
        head.left = g(pre, L1 + 1, L1+find-L2, in, L2, find - 1, valueIndexMap);

        head.right = g(pre, L1 + find -L2 + 1, R1, in, find + 1, R2, valueIndexMap);
        return head;

    }
}
