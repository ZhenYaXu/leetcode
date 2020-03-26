package com.xuzhenya.lcof.match;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.26
 */
public class offer_61_0326 {
    public boolean isStraight(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) continue;
            int val = nums[i + 1] - nums[i];
            if (val == 0)   return false;
            count += val;
        }
        return count <= 4 ? true : false;
    }
}
