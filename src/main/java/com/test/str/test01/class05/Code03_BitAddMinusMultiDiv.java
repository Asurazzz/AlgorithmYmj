package com.test.str.test01.class05;

/**
 * @Classname Code03_BitAddMinusMultiDiv
 * @Description 测试链接：https://leetcode.com/problems/divide-two-integers
 * @Date 2021/7/5 13:05
 * @Created by yemingjie
 */
public class Code03_BitAddMinusMultiDiv {

    public static int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            // 无进位相加信息 -> sum
            sum = a ^ b;
            // 进位信息 -> b-> b`
            b = (a & b) << 1;
            // a -> a` 无进位相加信息
            a = sum;
        }
        return sum;
    }


    /**
     * 取相反数
     * @param n
     * @return
     */
    public static int negNum(int n) {
        return add(~n, 1);
    }

    /**
     * 实现a-b
     * @param a
     * @param b
     * @return
     */
    public static int minus(int a, int b) {
        return  add(a, negNum(b));
    }


    /**
     * 实现a*b
     * @param a
     * @param b
     * @return
     */
    public static int multi(int a, int b) {
        int res = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                res = add(res, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int add = multi(58, 20);
        System.out.println(add);
    }
}
