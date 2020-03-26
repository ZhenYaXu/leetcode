package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/available-captures-for-rook/
 *
 * @author: xuzhenya
 * @date: 2020.03.26
 */
public class leetcode_999_0326 {
    public int numRookCaptures(char[][] board) {
        int raw = 0, col = 0, count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    raw = i;
                    col = j;
                }
            }
        }
        for (int i = raw; i < board.length; i++) {
            if (board[i][col] == 'B') break;
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }
        for (int j = raw; j >= 0; j--) {
            if (board[j][col] == 'B') break;
            if (board[j][col] == 'p') {
                count++;
                break;
            }
        }
        for (int i = col; i < board[0].length; i++) {
            if (board[raw][i] == 'B') break;
            if (board[raw][i] == 'p') {
                count++;
                break;
            }
        }
        for (int j = col; j >= 0; j--) {
            if (board[raw][j] == 'B') break;
            if (board[raw][j] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
