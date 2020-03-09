package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_34_1217 {

    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0 ) return new int[]{-1,-1};
        int left = 0,right = nums.length;
        int[] index = new int[2];
        if(target > nums[right-1] || target < nums[left]) return new int[]{-1,-1};
        index[0] = findLeft(nums,target,left,right);
        index[1] = findRight(nums,target,left,right);
        return index;
    }

    public int findLeft(int[] nums, int target, int left, int right){
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                right = mid;
            }else if(target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if(left == nums.length) return -1;
        return nums[left] == target ? left : -1;
    }

    public int findRight(int[] nums, int target, int left, int right){
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                left = mid + 1;
            }else if(target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if(right == 0) return -1;
        return nums[right-1] == target ? right - 1 : -1;
    }


}


