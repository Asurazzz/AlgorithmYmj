package com.test.str.test01.class06;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Classname Code01_MergeKSortedLists
 * @Description 测试链接 https://leetcode.com/problems/merge-k-sorted-lists/
 * @Date 2021/7/12 12:54
 * @Created by yemingjie
 */
public class Code01_MergeKSortedLists {

    public static class ListNode {
        public int val;
        public ListNode next;
    }

    public static class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                heap.add(lists[i]);
            }
        }

        if (heap.isEmpty()) {
            return null;
        }
        ListNode head = heap.poll();
        ListNode pre =  head;
        if (pre.next != null) {
            heap.add(pre.next);
        }

        while (!heap.isEmpty()) {
            ListNode cur = heap.poll();
            pre.next = cur;
            pre = cur;
            if (cur.next != null) {
                heap.add(cur.next);
            }
        }
        return head;


        
    }

}
