package com.test.str.test01.class01;

/**
 * @author : yemingjie
 * @date : 2021/5/5 19:48
 *
 * 选择排序和冒泡排序
 */
public class Code02_SelectionAndBubbleSort {


    public static void main(String[] args) {
        int[] arr = {13, 42, 14, 53, 34, 24, 35, 64};
        printArray(arr);
        // selectSort(arr);
        bubbleSort(arr);
        printArray(arr);

    }




    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        // 0 ~ N-1
        // 0 ~ N-2
        // 0 ~ N-3
        for (int end = N - 1; end >= 0; end--) {
            // 0 ~ end之间
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second-1, second);
                }
            }
        }
    }



    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
