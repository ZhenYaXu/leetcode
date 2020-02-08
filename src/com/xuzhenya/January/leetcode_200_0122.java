package com.xuzhenya.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/number-of-islands/
 *
 * @author: xuzhenya
 * @date: 2020.01.22
 */
public class leetcode_200_0122 {
    int ans = 0;
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)   return 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == '0' || grid[i][j] == '#')  continue;
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid,int x,int y) {
        int row = grid.length;
        int col = grid[0].length;
        if (!isValid(x,y,row,col) || grid[x][y] == '0' || grid[x][y] == '#') {
            return;
        }
        grid[x][y] = '#';
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }

    public boolean isValid(int x,int y,int row,int col) {
        if (x < row && y < col && x >= 0 && y>= 0)  return true;
        return false;
    }
}
