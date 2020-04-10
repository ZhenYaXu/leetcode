package com.xuzhenya.leetcode.april;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/game-of-life/
 *
 * @author: xuzhenya
 * @date: 2020.04.02
 */
public class leetcode_289_0402 {
    int[][] step = new int[][]{{-1,-1},{-1,0},{-1,1},{1,0},{1,1},{1,-1},{0,1},{0,-1}};
    int[][] temp;
    public void gameOfLife(int[][] board) {
        temp = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                temp[i][j] = board[i][j];
                dfs(board,i,j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }

    public void dfs(int[][] board, int x, int y) {
        int countAlive = 0 , countDead = 0;
        for (int i = 0; i < step.length; i++) {
            int m = x + step[i][0];
            int n = y + step[i][1];
            if (m >= 0 && m < board.length && n >= 0 && n < board[0].length) {
                if (board[x][y] == 0 && board[m][n] == 1) { // 死细胞
                    countAlive++;
                }
                if (board[x][y] == 1 && board[m][n] == 1) { // 活细胞
                    countDead++;
                }
            }
        }
        if (board[x][y] == 0 && countAlive == 3) temp[x][y] = 1;
        if (board[x][y] == 1 && (countDead < 2 || countDead > 3)) temp[x][y] = 0;
    }
}
