package com.xuzhenya.leetcode.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/powx-n/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_50_0105 {
    // 快速幂 （分奇偶讨论）
    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }
}
