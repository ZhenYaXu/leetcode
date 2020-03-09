package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 * @author: xuzhenya
 * @date: 2020.02.04
 */
public class leetcode_80_0204 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)   return nums.length;
        int count = 1, j = 0;
        for (int i = 1; i < nums.length; i++) { //从第三个数开始遍历
            if (nums[i-1] == nums[i])   count++;
            else    count = 1;
            if (count <= 2)  nums[j++] = nums[i];
        }
        return j;
    }
}
