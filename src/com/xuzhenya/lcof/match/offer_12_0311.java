package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class offer_12_0311 {
    int[][] step = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    int col,row;
    boolean[][] flag;
    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    flag[i][j] = true;
                    if (dfs(board,word,i,j,1))  return true;
                    flag[i][j] = false;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int x, int y, int index) {
        if (index == word.length()) return true;
        for (int k = 0; k < 4; k++) {
            int m = x + step[k][0];
            int n = y + step[k][1];
            if (isValid(m,n) && !flag[m][n] && board[m][n] == word.charAt(index)) {
                flag[m][n] = true;
                if (dfs(board, word, m, n, index + 1)) return true;
                flag[m][n] = false;
            }
        }
        return false;
    }

    public boolean isValid(int x,int y) {
        if (x >= 0 && x < row && y >= 0 && y < col) return true;
        return false;
    }
}
