package com.test.str.test02.class01;

/**
 * @Classname Code03_InsertionSort
 * @Description TODO
 * @Date 2021/8/3 13:01
 * @Created by yemingjie
 */
public class Code03_InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr, j, j+1);
            }
        }
    }

    /**
     * i和j是一个位置的话，会出错
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
