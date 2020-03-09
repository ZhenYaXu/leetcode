package com.xuzhenya.leetcode.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/132-pattern/
 *
 * @author: xuzhenya
 * @date: 2019.11.02
 */
public class leetcode_456_1102 {
    public static void main(String[] args) {

    }

    public boolean find132pattern(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i] > nums[j])
                    continue;
                else{
                    int temp = j;
                    for(int k = temp;k < nums.length;k++){
                        if (nums[k] < nums[temp] && nums[k] > nums[i]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;


    }

}
