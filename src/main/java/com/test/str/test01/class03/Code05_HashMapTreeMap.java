package com.test.str.test01.class03;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Classname Code05_HashMapTreeMap
 * @Description TODO
 * @Date 2021/6/21 20:05
 * @Created by yemingjie
 */
public class Code05_HashMapTreeMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ymj", "叶明杰");
        System.out.println(map.get("ymj"));

        String test1 = "ymj";
        String test2 = "ymj";
        System.out.println(map.containsKey(test1));
        System.out.println(map.containsKey(test2));

        System.out.println("======================");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(123456, "我是123456");

        Integer a = 123456;
        Integer b = 123456;
        System.out.println(a == b);
        // Integer Double Float String Char 等这些在Hash表 中全部按值传递
        System.out.println(map2.containsKey(a));
        System.out.println(map2.containsKey(b));

        System.out.println("======================");


        // 非基本类型按照引用来传递
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        HashMap<Node, String> map3 = new HashMap<>();
        map3.put(node1, "我来了");

        // false
        System.out.println(node1 == node2);
        // true
        System.out.println(node1.equals(node2));
        System.out.println(map3.containsKey(node1));
        System.out.println(map3.containsKey(node2));


        /**
         * hashmap中key如果是“金庸”，value放一整本倚天屠龙记的字，那hashmap存的量就是key和value的字节加在一起
         * 而如果把key放入node中，value放入node中，hashmap存node，那么hashmap只占用8 + 8 = 16字节的内存
         */

        System.out.println("======================");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "我是3");
        treeMap.put(0, "我是0");
        treeMap.put(7, "我是7");
        treeMap.put(2, "我是2");
        treeMap.put(5, "我是5");
        treeMap.put(9, "我是9");

        System.out.println(treeMap.containsKey(7));
        System.out.println(treeMap.containsKey(6));

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        // <=5 离5最近的key
        System.out.println(treeMap.floorKey(5));
        // <=6 离6最近的key
        System.out.println(treeMap.floorKey(6));
        // >=5 离5最近的key
        System.out.println(treeMap.ceilingKey(5));
        // >=6 离6最近的key
        System.out.println(treeMap.ceilingKey(6));
    }

    static class Node {
        int value;
        public Node(int value) {
            this.value = value;
        }
    }
}
