package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.08
 */
public class leetcode_376_0208 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)   return nums.length;
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1])    up = down + 1;
            if (nums[i] < nums[i-1])    down = up + 1;
        }
        return Math.max(up,down);
    }
}
