package com.test.str.test01.class18;

/**
 * 斐波那契数列
 */
public class Code_F {


    /**
     * 1, 1, 2, 3, 5,8
     * @param N
     * @return
     */
    public static int f(int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 1;
        }
        return f(N - 1) + f(N - 2);
    }
}
