package com.xuzhenya.leetcode.november;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/maximum-subarray/
 *
 * @author: xuzhenya
 * @date: 2019.11.03
 */
public class leetcode_53_1123 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        //sum[i] nums数组前i个最大字串和
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum[i-1] > 0)
                sum[i] = nums[i] + sum[i-1];
            else
                sum[i] = nums[i];
        }
        Arrays.sort(sum);
        return sum[sum.length-1];
    }

}
