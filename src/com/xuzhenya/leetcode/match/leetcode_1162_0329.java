package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/as-far-from-land-as-possible/
 *
 * @author: xuzhenya
 * @date: 2020.03.29
 */
public class leetcode_1162_0329 {
    int count = 0;
    boolean[][] flag;
    int[][] step = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    public int maxDistance(int[][] grid) {
        int raw = grid.length;
        int col = grid[0].length;
        flag = new boolean[raw][col];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    flag[i][j] = true;
                    count++;
                }else {
                    grid[i][j] = -1;
                    flag[i][j] = false;
                }
            }
        }
        if (count == 0 || count == raw * col) return -1;
        return dfs(grid,0);
    }

    public int dfs(int[][] dp,int level) {
        if (count == dp.length * dp[0].length)  return level;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (dp[i][j] == level) {
                    for (int k = 0; k < 4; k++) {
                        int m = i + step[k][0];
                        int n = j + step[k][1];
                        if (m >= 0 && m < dp.length && n >= 0 && n < dp[0].length && !flag[m][n]) {
                            count++;
                            dp[m][n] = level + 1;
                            flag[m][n] = true;
                        }
                    }
                }
            }
        }
        level += 1;
        return dfs(dp,level);
    }
}
