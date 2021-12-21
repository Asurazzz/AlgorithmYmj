package com.test.leetcode.test01.dp;

/**
 * @author admin
 * @version 1.0
 * @date 2021/12/21 17:25
 * <p>
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * 1,2,2,5,8   bccfi
 * 1,2,25,8    bczi
 * 1,22,5,8    bwfi
 * 12,25,8     mzi
 * 12,2,5,8    mcfi
 * <p>
 * 12,22,25,58
 */
public class Solution1 {

    public static void main(String[] args) {
        //int i = translateNum(12258);
        int i = translateNum(122581);
        //int i = translateNum(1225812);
        System.out.println(i);
    }

    /**
     * dp[0] dp[1] dp[2] dp[3] dp[4] dp[5]
     * <p>
     * a = dp[i-1]; b = dp[i -2]
     *
     * @param num
     * @return
     */
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        int a = 1, b = 1;
        for (int i = 2; i <= s.length(); i++) {
            System.out.println("========>第" + (i - 2) + "轮开始");
            String tmp = s.substring(i - 2, i);
            System.out.println("tmp = " + tmp);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? (a + b) : a;
            System.out.println("a = " + a + ",b = " + b + ",c = " + c);
            b = a;
            System.out.println("b = " + b);
            a = c;
            System.out.println("c = " + c);
            System.out.println("========>第" + (i - 2) + "轮结束");
        }
        return a;
    }
}
