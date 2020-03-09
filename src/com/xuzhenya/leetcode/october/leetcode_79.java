package com.xuzhenya.leetcode.october;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/word-search/
 * @author: xuzhenya
 * @date: 2019.10.29
 */
public class leetcode_79 {
    static int[][] step = {{-1,0},{1,0},{0,1},{0,-1}};

    public static void main(String[] args) {
        char[][] board ={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
                        };
        System.out.println(exist(board,"ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        if(word == null)    return true;
        int row = board.length;
        int col = board[0].length;
        if(word.length() > row * col) return false;

        int[][] flag = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++)
                flag[i][j]= 0;
        }
        return helper(board,word,0,flag,0,0);
    }

    public static boolean helper(char[][] board,String word,int index,int[][] flag,int x,int y){
        if(index == word.length() - 1)  return true;
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(index)) {
                    flag[i][j] = 1;
                    for(int t = 0;t < 4;t++){
                        int in = i + step[t][0];
                        int jn = j + step[t][1];
                        if(isValid(in,jn,board.length,board[0].length) && flag[in][jn] == 0) {
                            if(board[in][jn] == word.charAt(index++)){
                                flag[in][jn] = 1;
                            }

                        }
                    }
                    flag[i][j] = 0;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int x,int y,int m,int n) {
        if(x >= 0 && x <m && y >= 0 && y < n)   return true;
        return false;
    }
}
