package com.xuzhenya.leetcode.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/house-robber/
 *
 * @author: xuzhenya
 * @date: 2019.11.08
 */
public class leetcode_198_1108 {
    public int rob(int[] nums) {
        if(nums.length == 0)    return 0;
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++)
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
}
