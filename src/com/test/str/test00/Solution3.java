package com.test.str.test00;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Solution3 {

    /**
     * 1 2 3 4 5 null    cur 1, next 2, pre null,
     * 迭代  双指针
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        return recur(head, null);
    }

    private static ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        System.out.println("-----" + cur.val);
        ListNode res = recur(cur.next, cur);
//        System.out.println(res);
        cur.next = pre;
        System.out.println("=====" + cur.val);
        return res;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(listNode);
        ListNode listNode1 = reverseList2(listNode);
        System.out.println(listNode1);
    }

}

