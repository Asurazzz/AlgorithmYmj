package com.test.str.test00;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class Solution2 {
    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        int[] intVals = new int[size];
        node = head;
        while (node != null) {
            intVals[--size] = node.val;
            node = node.next;
        }
        return intVals;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
