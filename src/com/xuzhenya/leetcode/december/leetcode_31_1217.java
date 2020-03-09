package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/next-permutation/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_31_1217 {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0 || nums == null)    return;
        int k = -1;
        for(int i = nums.length - 1; i >= 1; i--)
            if(nums[i] > nums[i - 1]){
                k = i-1;
                for(int j = nums.length - 1; j > k ; j--){
                    if(nums[j] > nums[k]){
                        swap(nums,k,j);
                        break;
                    }
                }
                break;
            }
        reverse(nums,k+1);
    }

    public void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


