package com.test.str.test01.class04;

import org.w3c.dom.Node;

/**
 * @Classname Code01_ReverseList
 * @Description 反转链表
 * @Date 2021/6/23 13:07
 * @Created by yemingjie
 */
public class Code01_ReverseList {

    /**
     * 单节点
     */
    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            value = data;
        }
    }

    /**
     * 双节点
     */
    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            value = data;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        reverseLinkedList(n1);
        System.out.println(n1.value);
    }


    /**
     * 给定一个单链表的头head ，逆序
     * @param head
     * @return
     */
    public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 给定一个双链表的头head ，逆序
     * @param head
     * @return
     */
    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
