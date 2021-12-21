package com.test.str.test01.class02;

/**
 * @Classname RandToRead
 * @Description TODO
 * @Date 2021/6/11 13:05
 * @Created by yemingjie
 */
public class RandToRead {

    public static void main(String[] args) {

    }

    // x以固定概率返回0和1 ，但是x的内容看不到
    public static int x() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    /**
     * 等概率返回0和1
     * @return
     */
    public static int y() {
        int ans = 0;
        do {
            ans = x();
        } while (ans == x());
        // ans = 0  1
        // ans = 1  0

        return ans;
    }
}
