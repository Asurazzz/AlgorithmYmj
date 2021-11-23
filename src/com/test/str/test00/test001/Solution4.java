package com.test.str.test00.test001;

/**
 * 字符串转换成整数的功能
 */
public class Solution4 {

    public static void main(String[] args) {
        String str = "43";
        int c = str.charAt(0);
        System.out.println(c);
        System.out.println(str.charAt(0) - '0');
    }
    public static int strToInt(String str) {
        // 去除空格
        str = str.trim();

        int len = str.length();
        // 空字符串去除
        if (len == 0) {
            return 0;
        }

        // 遍历指针
        int index = 0;
        // 默认为正
        int sign = 1;
        // 符号位判断
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        int res = 0;
        for (;index < len; index++) {
            // 字符串转数字
            int digit = str.charAt(index) - '0';
            // 遇到非数字
            if (digit < 0 || digit > 9) break;
            // 越界处理
            if (res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE %10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
        }
        return sign * res;
    }
}
