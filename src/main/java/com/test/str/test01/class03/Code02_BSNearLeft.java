package com.test.str.test01.class03;

import java.util.Arrays;

/**
 * @Classname Code02_BSNearLeft
 * @Description 找到有序数组 >= num 最左的一个数的index
 * @Date 2021/6/16 12:56
 * @Created by yemingjie
 */
public class Code02_BSNearLeft {

    public static int mostLeftNoLessNumIndex(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return ans;
    }

    /**
     * for test
     */
    public static int test(int[] arr, int value) {
        for (int i = 0;i < arr.length; i++) {
            if (arr[i] >= value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * for test
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1)* Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean successd = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int)((maxValue + 1) * Math.random()) - (int)(maxValue * Math.random());
            if (test(arr, value) != mostLeftNoLessNumIndex(arr, value)) {
                System.out.println(value);
                System.out.println(test(arr, value));
                System.out.println(mostLeftNoLessNumIndex(arr, value));
                System.out.println("出错了！");
                successd = false;
                break;
            }
        }
        System.out.println(successd ? "Nice!" : "Fucking fucked！");
    }
}
