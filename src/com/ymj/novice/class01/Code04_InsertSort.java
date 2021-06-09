package com.ymj.novice.class01;

/**
 * @author : yemingjie
 * @date : 2021/5/5 21:05
 */
public class Code04_InsertSort {

    public static void main(String[] args) {
        int[] arr = {13, 42, 14, 53, 34, 24, 35, 64};
        printArray(arr);
        // selectSort(arr);
        insertSort2(arr);
        printArray(arr);
    }

    public static void insertSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumIndex = end;
            while (newNumIndex -1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
            }
        }

    }

    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            // pre是新数的前一个位置end   pre = end -1
            // 前一个位置的数没越界并且前一个数比现在大，那么交换 并且 pre--，一旦不成立则跳出for循环
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
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
