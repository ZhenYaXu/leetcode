package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_33_1217 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0 ) return -1;
        int left = 0,right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (left <= right){
            if(nums[mid] == target) return mid;
            if(nums[left] <= nums[mid]){ // 左边数组有序，进行二分查找
                if(target >= nums[left] && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else {
                if(target >= nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            mid = left + (right - left) / 2;
        }

        return -1;
    }


}


