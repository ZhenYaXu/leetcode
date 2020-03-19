package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_47_0316 {
    public int maxValue(int[][] grid) {
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                // 边界判断
                if(i == 0 && j == 0)
                    continue;
                else if(i == 0 && j != 0)
                    grid[i][j] += grid[i][j-1];
                else if(i != 0 && j == 0)
                    grid[i][j] += grid[i-1][j];
                else
                    grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
