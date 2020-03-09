package com.xuzhenya.leetcode.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/maximal-square/
 *
 * @author: xuzhenya
 * @date: 2020.01.27
 */
public class leetcode_221_0127 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0)   return 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        int maxSide = 0;
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;
                    maxSide = Math.max(dp[i][j],maxSide);
                }
            }
        }
        return maxSide * maxSide;
    }
}
