package com.xuzhenya.lcof.match;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_56_0316 {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        int x = xor & (-xor);

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & x) == 0) {
                res[0] ^= nums[i];
            }else{
                res[1] ^= nums[i];
            }
        }
        return res;
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2) {
            if (nums[i]==nums[i+1]&&nums[i]==nums[i+2]) {
                i+=2;
            }else {
                return nums[i];
            }
            i++;
        }
        return nums[nums.length-1];
    }
}
