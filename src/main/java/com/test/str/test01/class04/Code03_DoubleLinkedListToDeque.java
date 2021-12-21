package com.test.str.test01.class04;

import org.w3c.dom.Node;

/**
 * @Classname Code03_DoubleLinkedListToDeque
 * @Description TODO
 * @Date 2021/6/29 12:49
 * @Created by yemingjie
 * 双向链表实现双端队列
 */
public class Code03_DoubleLinkedListToDeque {


    public static class Node<V> {
        public V value;
        public Node<V> last;
        public Node<V> next;

        public Node(V v) {
            value = v;
            last = null;
            next = null;
        }
    }

    public static class MyDeque<V> {

    }


}
