package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.23
 */
public class leetcode_581_0223 {
    public int findUnsortedSubarray(int[] nums) {
        int high = 0, low = nums.length - 1, min = nums[nums.length-1], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i],max);
            if (nums[i] > max)  high = i;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min,nums[i]);
            if (nums[i] < min)  low = i;
        }

        return high > low ? high - low + 1 : 0;
    }
}
