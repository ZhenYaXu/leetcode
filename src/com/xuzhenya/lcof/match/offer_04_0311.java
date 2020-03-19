package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class offer_04_0311 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int col = matrix[0].length - 1;
        int row = 0;

        while (col >= 0 && row <matrix.length) {
            if (matrix[row][col] == target) return true;
            if (matrix[row][col] > target)  col -= 1;
            else  row += 1;
        }
        return false;
    }
}
