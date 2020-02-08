package com.xuzhenya.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/set-matrix-zeroes/
 *
 * @author: xuzhenya
 * @date: 2020.02.04
 */
public class leetcode_73_0204 {
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0)  isCol = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0) matrix[0][0] = 0;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;   // 所在行第一个元素赋值0
                    matrix[0][j] = 0;   // 所在列第一个元素赋值0
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            for (int j = 1; j < matrix[0].length; j++)
                matrix[0][j] = 0;
        }
        if (isCol) {
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
        }
    }
}
