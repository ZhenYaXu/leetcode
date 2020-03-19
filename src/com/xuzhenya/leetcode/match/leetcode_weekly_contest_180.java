package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.december.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.15
 */
public class leetcode_weekly_contest_180 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;
            boolean flag = true;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            for (int k = 0; k < matrix.length; k++) {
                if (min < matrix[k][col])   flag = false;
            }
            if (flag)   res.add(min);
        }
        return res;
    }


    public TreeNode balanceBST(TreeNode root) {
        if (root == null)   return null;


        return root;
    }

    public void createBST() {

    }



    public String compressString(String S) {
        StringBuffer res = new StringBuffer("");
        int len = 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                len++;
            }else {
                res.append(S.charAt(i)).append(len);
                len = 1;
            }
        }
        res.append(S.charAt(S.length() - 1)).append(len);
        return res.toString().length() > S.length() ? S : res.toString();
    }
}
