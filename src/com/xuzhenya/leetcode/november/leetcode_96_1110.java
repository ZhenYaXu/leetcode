package com.xuzhenya.leetcode.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/unique-binary-search-trees/
 *              给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 *
 * @author: xuzhenya
 * @date: 2019.11.10
 */
public class leetcode_96_1110 {
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
