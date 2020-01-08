package com.xuzhenya.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/majority-element/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_169_0108 {
    /**
     * 借助HashMap，空间换时间的方法
     * @param nums
     * @return
     */
//    public int majorityElement(int[] nums) {
//        HashMap<Integer,Integer> res = new HashMap<>();
//        for (int num : nums) {
//            res.put(num,res.getOrDefault(num,0) + 1);
//        }
//        for (Integer key : res.keySet()) {
//            if (res.get(key) > (nums.length / 2))
//                return key;
//        }
//        return -1;
//    }

    /**
     * 分治法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    /**
     * 将数组分解为左右数组，然后直至数组大小为1，则必定是此时数组的众数。
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public int helper(int[] nums,int left,int right) {
        if(left == right)     return nums[left];
        int mid = left + (right - left) / 2;

        int left_res = helper(nums,left,mid);
        int right_res = helper(nums,mid+1,right);

        if(left_res == right_res)   return left_res;

        int left_count = countNums(nums, left_res, left, right);
        int right_count = countNums(nums, right_res, left, right);

        return left_count > right_count ? left_res : right_res;
    }

    /**
     * 统计子数组中返回的众数分别在原数组众出现了多少次
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public int countNums(int[] nums,int target,int left,int right){
        int count = 0;
        for (int i = left; i <= right; i++) {
            if(nums[i] == target)
                count++;
        }
        return count;
    }
}
