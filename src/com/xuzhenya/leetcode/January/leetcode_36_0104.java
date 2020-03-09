package com.xuzhenya.leetcode.January;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/valid-sudoku/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_36_0104 {
    public static void main(String[] args) {
        leetcode_36_0104 test = new leetcode_36_0104();
        char[][] board = new char[][]{
                  {'5','3','.','.','7','.','.','.','.'},
                  {'6','.','.','1','9','5','.','.','.'},
                  {'.','9','8','.','.','.','.','6','.'},
                  {'8','.','.','.','6','.','.','.','3'},
                  {'4','.','.','8','.','3','.','.','1'},
                  {'7','.','.','.','2','.','.','.','6'},
                  {'.','6','.','.','.','.','2','8','.'},
                  {'.','.','.','4','1','9','.','.','5'},
                  {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(test.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        // 验证每一行
        for (int i = 0; i < 9; i++){
            if (!validRowOrColumn(board[i]))
                return false;
        }
        char[] col;
        // 验证每一列
        for (int i = 0; i < 9; i++) {
            col = new char[9];
            for (int j = 0; j < 9; j++)
                col[j] = board[j][i];
            if (!validRowOrColumn(col))
                return false;
        }
        // 验证9个3*3的子单元格
        char[][] area = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                area[i][j] = board[i][j];
        if (!validArea(area))
            return false;
        for (int i = 0; i < 3; i++)
            for (int j = 3; j < 6; j++)
                area[i][j-3] = board[i][j];
        if (!validArea(area))
            return false;

        for (int i = 0; i < 3; i++)
            for (int j = 6; j < 9; j++)
                area[i][j-6] = board[i][j];
            if (!validArea(area))
                return false;

        for (int i = 3; i < 6; i++)
            for (int j = 0; j < 3; j++)
                area[i-3][j] = board[i][j];
        if (!validArea(area))
            return false;

        for (int i = 3; i < 6; i++)
            for (int j = 3; j < 6; j++)
                area[i-3][j-3] = board[i][j];
        if (!validArea(area))
            return false;

        for (int i = 3; i < 6; i++)
            for (int j = 6; j < 9; j++)
                area[i-3][j-6] = board[i][j];
        if (!validArea(area))
            return false;


        for (int i = 6; i < 9; i++)
            for (int j = 0; j < 3; j++)
                area[i-6][j] = board[i][j];
        if (!validArea(area))
            return false;

        for (int i = 6; i < 9; i++)
            for (int j = 3; j < 6; j++)
                area[i-6][j-3] = board[i][j];
        if (!validArea(area))
            return false;

        for (int i = 6; i < 9; i++)
            for (int j = 6; j < 9; j++)
                area[i-6][j-6] = board[i][j];
        if (!validArea(area))
            return false;

        return true;
    }

    public boolean validRowOrColumn(char[] line) {
        HashMap<Character,Integer> map = new HashMap();
        for (char c : line)
            if(c != '.'){
                map.put(c,map.getOrDefault(c,0) + 1);
                if (map.get(c) > 1)
                    return false;
            }
        return true;
    }


    public boolean validArea(char[][] area) {
        HashMap<Character,Integer> map = new HashMap();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if(area[i][j] != '.'){
                    map.put(area[i][j],map.getOrDefault(area[i][j],0) + 1);
                    if (map.get(area[i][j]) > 1)
                        return false;
                }
            }
        return true;
    }
}
