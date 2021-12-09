package com.test.str.test02.class01;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        String abcdef = reverseLeftWords("abcdef", 2);
        System.out.println(abcdef);
    }

    public static String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            System.out.println("i :" + i + ", n + s.length() " + (n+s.length()) + "  i % s.length():" + i % s.length());
            res.append(s.charAt(i % s.length()));
            System.out.println("=======================");
        }
        return res.toString();
    }
}
