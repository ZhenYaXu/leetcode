package com.xuzhenya.leetcode.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 *
 * @author: xuzhenya
 * @date: 2020.01.08
 */
public class leetcode_240_0108 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = 0;
        int n = matrix[0].length - 1;
        while (m < matrix.length && n >= 0) {
            if (matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] > target) {
                n--;
            } else {
                m++;
            }
        }
        return false;
    }
}
