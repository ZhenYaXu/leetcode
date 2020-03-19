package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/max-area-of-island/
 *
 * @author: xuzhenya
 * @date: 2020.03.15
 */
public class leetcode_695_0315 {
    int[][] step = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res,dfs(grid,i,j));
                }
            }
        }
        return res;
    }
    public int dfs(int[][] grid, int x, int y) {
        grid[x][y] = 0;
        int count = 1;
        for (int i = 0; i < 4; i++) {
            int m = x + step[i][0];
            int n = y + step[i][1];
            if (m >= 0 && m < grid.length && n >= 0 && n < grid[0].length && grid[m][n] == 1) {
                count += dfs(grid,m,n);
            }
        }
        return count;
    }
}
