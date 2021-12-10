package com.test.str.test01.class18;

/**
 * 机器人走路
 *
 * @author admin
 */
public class Code01_RobotWalk {

    /**
     * @param N     长度
     * @param start 起始位置
     * @param aim   目标位置
     * @param K     移动步数
     * @return
     */
    public static int ways1(int N, int start, int aim, int K) {
        return process1(start, K, aim, N);
    }

    /**
     * @param cur  机器人当前来到的位置
     * @param rest 机器人还有多少步需要走
     * @param aim  最终的目标是aim
     * @param N    有哪些位置
     * @return 机器人从cur出发，走过rest步骤之后，最终停在aim的方法数是多少？
     */
    public static int process1(int cur, int rest, int aim, int N) {
        if (rest == 0) {
            // 已经不需要走了，那么就发现一种方法返回1，否则返回0
            return cur == aim ? 1 : 0;
        }

        if (cur == 1) {
            // 1 -> 2 因为1只能去2，所以和2去aim的方法数应该是相同的
            return process1(2, rest - 1, aim, N);
        }
        if (cur == N) {
            // 到N只能去N-1，同上
            return process1(N - 1, rest - 1, aim, N);
        }
        // 停在中间位置,可以向左走也可以向右走
        return process1(cur - 1, rest - 1, aim, N) + process1(cur + 1, rest - 1, aim, N);


    }


    public static int ways2(int N, int start, int aim, int K) {
        int[][] dp = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = -1;
            }
        }
        /**
         * dp就是缓存表
         * dp[cur][rest] == -1   ---> process1(cur, rest)之前没算过！
         * dp[cur][rest] != -1   ---> process1(cur, rest)之前算过！算完的返回值放在了dp[cur][rest]中
         * N+1 * K+1
         */
        return process2(start, K, aim, N, dp);
    }

    /**
     * cur 的范围：1 ~ N
     * rest的范围：0 ~ K
     * 自顶向下的动态规划
     * 动态规划： 所有的重复过程只触发了一次
     * @param cur
     * @param rest
     * @param aim
     * @param N
     * @return
     */
    public static int process2(int cur, int rest, int aim, int N, int[][] dp) {
        if (dp[cur][rest] != -1) {
            // 表示之前来过
            return dp[cur][rest];
        }
        // 之前没有算过！
        int ans = 0;
        if (rest == 0) {
            ans = cur == aim ? 1 : 0;
        } else if (cur == 1) {
            ans = process2(2, rest - 1, aim, N, dp);
        } else if (cur == N) {
            ans = process2(N - 1, rest - 1, aim, N, dp);
        } else {
            ans = process2(cur - 1, rest - 1, aim, N, dp) + process2(cur + 1, rest - 1, aim, N, dp);
        }
        dp[cur][rest] = ans;
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(ways1(4, 2, 4, 4));
        System.out.println(ways2(4, 2, 4, 4));
        System.out.println(ways2(5, 2, 4, 6));
    }

}
