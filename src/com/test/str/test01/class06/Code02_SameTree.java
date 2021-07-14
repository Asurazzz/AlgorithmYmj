package com.test.str.test01.class06;

import javax.swing.tree.TreeNode;

/**
 * @Classname Code02_SameTree
 * @Description 判断两棵树结构是否相等
 * 测试链接：https://leetcode.com/problems/same-tree
 * @Date 2021/7/14 12:59
 * @Created by yemingjie
 */
public class Code02_SameTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 相同为0，不同为1 ，两个都不同说明就不相等，直接false
        if (p == null ^ q == null) {
            return false;
        }
        // 头节点都为空，为true
        if (p == null && q == null) {
            return true;
        }
        // 都不为空的情况下
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
