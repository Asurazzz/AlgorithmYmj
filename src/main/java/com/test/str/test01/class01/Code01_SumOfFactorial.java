package com.test.str.test01.class01;

/**
 * @author : yemingjie
 * @date : 2021/5/4 23:40
 *
 *  给定一个参数N
 *      返回 1! + 2! + 3! + ... + N! 的结果
 */
public class Code01_SumOfFactorial {


    /**
     * 方法一： 每个相加
     * @param N
     * @return
     */
    public static long f1(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    /**
     * 方法二： 求出一个阶乘就相加
     */
    public static long f2(int N) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }

    /**
     * 阶乘算法
     * @param N
     * @return
     */
    public static long factorial(int N) {
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(f1(10));
        System.out.println(f2(10));
    }

}
