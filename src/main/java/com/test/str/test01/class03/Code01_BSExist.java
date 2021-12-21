package com.test.str.test01.class03;

import java.util.Arrays;

/**
 * @Classname Code01_BSExist
 * @Description TODO
 * @Date 2021/6/15 13:11
 * @Created by yemingjie
 */
public class Code01_BSExist {

    /**
     * 二分查找  arr保证有序
     * 有序数组中找到num
     * @param arr
     * @param num
     * @return
     */
    public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        // 有效范围
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return false;

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
            if (test(arr, value) != find(arr, value)) {
                System.out.println("出错了！");
                successd = false;
                break;
            }
        }
        System.out.println(successd ? "Nice!" : "Fucking fucked！");
    }

    /**
     * for test
     */
    public static boolean test(int[] sortedArr, int num) {
        for (int cur : sortedArr) {
            if (cur == num) {
                return true;
            }
        }
        return false;
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
}
