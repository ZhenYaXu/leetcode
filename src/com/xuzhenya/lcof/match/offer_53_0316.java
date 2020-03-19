package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_53_0316 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length;
        int mid;
        if (nums[0] != 0)   return 0;
        while (left < right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] > mid) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
