package com.test.str.test01.class01;

/**
 * @author : yemingjie
 * @date : 2021/4/15 22:40
 *  打印一个数字的32进制   int类型占用4个字节  4*8 = 32
 */
public class Code06_PrintB {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int num = 4;
////        print(-2);
////
////        int a = Integer.MIN_VALUE;
////        System.out.println(a);

//        int b = 123823138;
//        int c = ~b;
//        print(b);
//        print(c);

            int a = Integer.MIN_VALUE;
            int b = ~a + 1;
            print(a);
            print(b);
    }
}
