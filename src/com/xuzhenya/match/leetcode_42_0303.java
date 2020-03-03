package com.xuzhenya.match;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.03
 */
public class leetcode_42_0303 {
    public int trap(int[] height) {
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            max_right[i] = Math.max(max_right[i - 1],height[i - 1]);
        }

        for (int i = height.length - 2; i >= 0 ; i--) {
            max_left[i] = Math.max(max_left[i + 1],height[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            int high = Math.min(max_left[i], max_right[i]);
            if (high > height[i])
                res += (high - height[i]);
        }
        return res;
    }
}
