package com.xuzhenya.leetcode.february;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * @author: xuzhenya
 * @date: 2020.02.24
 */
public class leetcode_448_0224 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            nums[temp - 1] = -Math.abs(nums[temp - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)    ans.add(i + 1);
        }
        return ans;
    }
}
