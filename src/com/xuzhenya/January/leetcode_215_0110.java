package com.xuzhenya.January;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 *
 * @author: xuzhenya
 * @date: 2020.01.10
 */
public class leetcode_215_0110 {

    int [] nums;

    public static void main(String[] args) {
        leetcode_215_0110 test = new leetcode_215_0110();
        System.out.println(test.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }

    public void swap(int a, int b) {
        int tmp = this.nums[a];
        this.nums[a] = this.nums[b];
        this.nums[b] = tmp;
    }


    public int partition(int left, int right, int pivot_index) {
        int pivot = this.nums[pivot_index];
        // 1. move pivot to end
        swap(pivot_index, right);
        int store_index = left;

        // 2. move all smaller elements to the left
        for (int i = left; i <= right; i++) {
            if (this.nums[i] < pivot) {
                swap(store_index, i);
                store_index++;
            }
        }

        // 3. move pivot to its final place
        swap(store_index, right);

        return store_index;
    }

    public int quickselect(int left, int right, int k_smallest) {
    /*
    Returns the k-th smallest element of list within left..right.
    */

        if (left == right) // If the list contains only one element,
            return this.nums[left];  // return that element

        // select a random pivot_index
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left);

        pivot_index = partition(left, right, pivot_index);

        // the pivot is on (N - k)th smallest position
        if (k_smallest == pivot_index)
            return this.nums[k_smallest];
            // go left side
        else if (k_smallest < pivot_index)
            return quickselect(left, pivot_index - 1, k_smallest);
        // go right side
        return quickselect(pivot_index + 1, right, k_smallest);
    }

    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        int size = nums.length;
        // kth largest is (N - k)th smallest
        return quickselect(0, size - 1, size - k);
    }




//    public int findKthLargest(int[] nums, int k) {
//        int len = nums.length;
//        int left = 0;
//        int right = len - 1;
//
//        // 转换一下，第 k 大元素的索引是 len - k
//        int target = len - k;
//
//        while (true) {
//            int index = partition(nums, left, right);
//            if (index == target) {
//                return nums[index];
//            } else if (index < target) {
//                left = index + 1;
//            } else {
//                right = index - 1;
//            }
//        }
//    }
//
//    /**
//     * 在数组 nums 的子区间 [left, right] 执行 partition 操作，返回 nums[left] 排序以后应该在的位置
//     * 在遍历过程中保持循环不变量的语义
//     * 1、[left + 1, j] < nums[left]
//     * 2、(j, i] >= nums[left]
//     *
//     * @param nums
//     * @param left
//     * @param right
//     * @return
//     */
//    public int partition(int[] nums, int left, int right) {
//        int pivot = nums[left];
//        int j = left;
//        for (int i = left + 1; i <= right; i++) {
//            if (nums[i] < pivot) {
//                // 小于 pivot 的元素都被交换到前面
//                j++;
//                swap(nums, j, i);
//            }
//        }
//        // 在之前遍历的过程中，满足 [left + 1, j] < pivot，并且 (j, i] >= pivot
//        swap(nums, j, left);
//        // 交换以后 [left, j - 1] < pivot, nums[j] = pivot, [j + 1, right] >= pivot
//        return j;
//    }
//
//    private void swap(int[] nums, int index1, int index2) {
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//    }
}

