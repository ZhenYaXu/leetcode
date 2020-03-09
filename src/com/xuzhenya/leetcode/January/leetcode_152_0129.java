package com.xuzhenya.leetcode.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/maximum-product-subarray/
 *
 * @author: xuzhenya
 * @date: 2020.01.29
 */
public class leetcode_152_0129 {
    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        int res = Integer.MIN_VALUE, imax = 1, imin = 1;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i],dp[i-1] * nums[i]);
            imin = Math.min(nums[i],dp[i-1] * nums[i]);

            res = Math.max(imax,res);
        }
        return res;
    }
}
