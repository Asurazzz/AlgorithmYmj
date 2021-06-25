package com.test.str.test01.class04;

/**
 * @Classname Code02_LinkedListToQueueAndStack
 * @Description TODO
 * @Date 2021/6/25 13:07
 * @Created by yemingjie
 */
public class Code02_LinkedListToQueueAndStack {

    public static class Node<V> {
        public V value;
        public Node<V> next;
        public Node(V v) {
            value = v;
            next = null;
        }
    }
}
