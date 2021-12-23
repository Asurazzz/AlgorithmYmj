package com.test.leetcode.test01.dp;

/**
 * @author admin
 * @version 1.0
 * @date 2021/12/23 10:10
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、
 * 直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 * 设 f(i,j) 为从棋盘左上角走至单元格  (i ,j)的礼物最大累计价值
 * f(i,j) 等于 f(i, j-1)和f(i-1, j)中较大值加上当前单元格的礼物价值grid(i,j);
 * f(1, 1) = max[f(0, 1), f(1,0)] + grid(1, 1);
 * f(i, j) = max[f(i - 1, j), f(i, j - 1)] + grid(i, j);
 */
public class Solution2 {

    /**
     * [
     *      [1,3,1,4],
     *      [1,5,1,6],
     *      [4,2,1,1]
     * ]
     * @param args
     */
    public static void main(String[] args) {
        int[][] grid = {{1,3,1,4}, {1,5,1,6}, {4,2,1,1}};
        int i = maxValue(grid);
        System.out.println(i);
    }

    public static int maxValue(int[][] grid) {
        // m是高，n是宽
        int m = grid.length, n = grid[0].length;
        System.out.println("m = " + m + ",n = " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    // 第一行只能向右
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    // 第一列只能向下
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }

            }
        }
        // 返回右下角
        return grid[m - 1][n - 1];
    }
}
