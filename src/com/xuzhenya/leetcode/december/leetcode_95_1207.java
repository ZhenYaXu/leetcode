package com.xuzhenya.leetcode.december;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_95_1207 {
    List<TreeNode> res = new ArrayList();
    public List<TreeNode> generateTrees(int n) {

        return res;
    }

    public int numTrees(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                f[i] += f[j - 1] * f[i - j];
            }
        }
        return f[n];
    }

}


