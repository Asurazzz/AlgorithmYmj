package com.test.str.test01;

/**
 * @author : yemingjie
 * @date : 2021/4/25 22:50
 * 字符串匹配：设 S 和 T 是给定的两个串，在主串 S 中找到模式串 T 的过程称为字符串匹配，
 * 如果在主串 S 中找到 模式串 T ，则称匹配成功，函数返回 T 在 S 中首次出现的位置，否则匹配不成功，返回 -1。
 *
 *      给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1
 *      输入: haystack = "hello", needle = "ll" 输出: 2
 *      输入: haystack = "aaaaa", needle = "bba" 输出: -1
 */
public class BruteForce {
    public static int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();

        // 特殊情况
        if (haylen < needlen) {
            return -1;
        }
        if (haylen == 0) {
            return 0;
        }
        // 主 串
        for (int i = 0; i < haylen - needlen + 1; i++) {
            int j;
            // 模式串
            for (j = 0; j < needlen; j++) {
                // 不符合的情况，直接跳出，主串指针后移一位
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // 匹配成功
            if (j == needlen) {
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }
}
