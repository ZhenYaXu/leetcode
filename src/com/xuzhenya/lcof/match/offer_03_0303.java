package com.xuzhenya.lcof.match;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.03
 */
public class offer_03_0303 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(nums[i],0) == 1)   return nums[i];
            map.put(nums[i],1);
        }
        return 0;
    }
}
