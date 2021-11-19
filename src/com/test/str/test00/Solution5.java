package com.test.str.test00;


/**
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 */

import java.util.Arrays;

/**
 * 思路：通过两层循环，第一层循环是来遍历传进来的数组，
 * 第二层循环是用来遍历从第i + 1个位置到i + k个位置，
 * 也就是那个框的大小，比较里面的值的大小，将最大的赋值给定义的变量
 * 然后每比较完一次就将值装进定义好的新数组中，数组的长度可由数学公式
 * length = length - k + 1;得出，最后返回这个数组。
 *
 */
public class Solution5 {


    public static void main(String[] args) {
        int[] nums = {1, 3, -1 ,-3, 5, 3, 6, 7};
        int[] ints = maxSlidingWindow(nums, 3);
        Arrays.stream(ints).forEach(System.out::println);
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
            int length = nums.length;
        if (length == 0) {
            return new int[]{};
        }

        int[] res = new int[length - k + 1];
        for (int i = 0;i <= length - k; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < (i + k); j++) {
                if (sum < nums[j]) {
                    sum = nums[j];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}













