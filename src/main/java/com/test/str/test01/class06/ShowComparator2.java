package com.test.str.test01.class06;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Classname ShowComparator2
 * @Description 优先级队列：堆
 * compareTo 是字典序
 * @Date 2021/7/9 13:01
 * @Created by yemingjie
 */
public class ShowComparator2 {



    public static void main(String[] args) {
        // 默认是小根堆，从小到大
        //PriorityQueue<Integer> heap = new PriorityQueue<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(new MyCompartor());
        heap.add(6);
        heap.add(2);
        heap.add(3);
        heap.add(1);
        heap.add(7);
        System.out.println(heap.peek());
        heap.add(0);
        System.out.println(heap.peek());
        System.out.println("================");
        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
    }


    public static class MyCompartor implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2) {
                return 1;
            } else if (o1 > o2) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

    }

}
