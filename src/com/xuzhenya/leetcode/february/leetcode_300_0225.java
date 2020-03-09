package com.xuzhenya.leetcode.february;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.25
 */
public class leetcode_300_0225 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)   return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])  dp[i] = Math.max(dp[j]+1,dp[i]);
            }
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
