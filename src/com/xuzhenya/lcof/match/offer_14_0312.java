package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.12
 */
public class offer_14_0312 {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int k = 1; k < n; k++) {
                dp[i] = Math.max(Math.max(dp[k] * dp[i - k] , dp[i]),(i - k) * k);
            }
        }
        return dp[n];
    }
}
