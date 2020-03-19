package com.xuzhenya.leetcode.match;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/sliding-window-maximum/
 *
 * @author: xuzhenya
 * @date: 2020.03.10
 */
public class leetcode_239_0310 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (nums == null || len == 0)   return new int[]{};
        if (nums.length < k) {
            Arrays.sort(nums);
            return new int[]{nums[len - 1]};
        }
        int[] res = new int[len - k + 1];

        for (int i = 0; i <= len - k; i++) {
            res[i] = getMax(i,i + k - 1,nums);
        }
        return res;
    }

    public int getMax(int left, int right, int[] nums) {
        int max_val = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            max_val = Math.max(max_val,nums[i]);
        }
        return max_val;
    }
}
