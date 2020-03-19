package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class offer_10_0311 {
    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 2] + res[i - 1];
            res[i] = (res[i] % 1000000007);
        }
        return res[n];
    }
}
