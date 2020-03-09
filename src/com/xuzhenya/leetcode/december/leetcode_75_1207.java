package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_75_1207 {
    public void sortColors(int[] nums) {
        //维护指针i之前都是0，指针j之后都是2
        //然后对数组进遍历
        int i = 0, k = 0, j = nums.length - 1;
        while (k <= j) {
            if(nums[k] == 0){
                swap(nums,i,k);
                i++;
                k++;
            }else if(nums[k] == 1){
                k++;
            }else {
                swap(nums,k,j);
                j--;
            }
        }

    }

    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}


