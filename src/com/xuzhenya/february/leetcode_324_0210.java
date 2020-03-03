package com.xuzhenya.february;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/wiggle-sort-ii/
 *
 * @author: xuzhenya
 * @date: 2020.02.10
 */
public class leetcode_324_0210 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int m = len % 2 == 0 ? (len / 2 - 1) : (len / 2);
        int n = len - 1;
        int[] res = new int[nums.length];
        if (len % 2 != 0)   res[len - 1] = nums[0];
        for (int i = 0, j = 1; i < len && j < len; i += 2, j += 2) {
            res[i] = nums[m--];
            res[j] = nums[n--];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = res[i];
        }
    }
}
