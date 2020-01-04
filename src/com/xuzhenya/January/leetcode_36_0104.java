package com.xuzhenya.January;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/valid-sudoku/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_36_0104 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++)
            validRowOrColumn(board[i]);
        char[] col;
        for (int i = 0; i < 9; i++) {
            col = new char[9];
            for (int j = 0; j < 9; j++)
                col[j] = board[j][i];
            validRowOrColumn(col);
        }
    }

    public boolean validRowOrColumn(char[] line) {
        Map map = new HashMap<Character,Integer>();
        for (char c : line)
            if(c >= '1' && c <= '9'){
                if (map.get(c) != null)
                    return false;
                else
                    map.put(c,1);
            }
        return true;
    }


    public boolean validArea(char[][] area) {
        Map map = new HashMap<Character,Integer>();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if(area[i][j] >= '1' && area[i][j] <= '9'){
                    if (map.get(area[i][j]) != null)
                        return false;
                    else
                        map.put(area[i][j],1);
                }
            }
        return true;
    }
}
