package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.17
 */
public class offer_42_0317 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max < 0)
                max = nums[i];
            else
                max += nums[i];
            res = Math.max(res, max);
        }
        return res;
    }
}
