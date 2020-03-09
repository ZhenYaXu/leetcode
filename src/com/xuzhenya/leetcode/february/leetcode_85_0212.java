package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/maximal-rectangle/
 *
 * @author: xuzhenya
 * @date: 2020.02.13
 */
public class leetcode_85_0212 {
    public int maximalRectangle(char[][] matrix) {
        int [][] ans = new int[matrix.length][matrix[0].length];
        ans[0][0] = (matrix[0][0] == '1' ? 1 : 0);
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == '1')  ans[i][0] = ans[i-1][0] + 1;
            else ans[i][0] = 0;
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1')  ans[0][i] = ans[0][i-1] + 1;
            else ans[0][i] = 0;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
//                if (matrix[i-1][j-1])
            }
        }

        return 0;
    }
}
