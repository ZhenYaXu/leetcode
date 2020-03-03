package com.xuzhenya.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/product-of-array-except-self/
 *
 * @author: xuzhenya
 * @date: 2020.03.02
 */
public class leetcode_238_0302 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            left[i + 1] = left[i] * nums[i];
        }

        for (int j = nums.length - 1; j >= 1; j--) {
            right[j - 1] = right[j] * nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }

}
