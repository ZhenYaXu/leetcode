package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/sort-an-array/
 *
 * @author: xuzhenya
 * @date: 2020.03.31
 */
public class leetcode_912_0331 {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        qSort(nums, 0, nums.length - 1);
        insertSort(nums);
        // shellSort(nums);
        // bucketSort(nums);
        // countSort(nums);
        // mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void qSort(int[] nums, int start, int end) {
        int left = start, right = end;
        if (start < end) {
            int flag = nums[left];
            while (left < right) {
                while (left < right && nums[right] >= flag) right--;
                if (left < right)   nums[left] = nums[right];
                while (left < right && nums[left] < flag) left++;
                if (left < right)   nums[right] = nums[left];
            }
            nums[left] = flag;
            qSort(nums,start,left - 1);
            qSort(nums,left + 1,end);
        }

    }

    public void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < temp) {
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }else {
                    break;
                }
            }
        }
    }

    public void mergeSort(int[] nums,int start,int end) {
        if (start >= end)    return;
        int mid = (start + end) / 2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid + 1,end);
        merge(nums,start,mid,end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int l = start, m = mid + 1, r = end;
        int[] arr = new int[end - start + 1];
        int k = 0;
        while (l <= mid && m <= r) {
            if(nums[l] < nums[m]){
                arr[k++] = nums[l++];
            }else{
                arr[k++] = nums[m++];
            }
        }

        while (l <= mid) {
            arr[k++] = nums[l++];
        }
        while (m <= r) {
            arr[k++] = nums[m++];
        }
        //复制回原素组
        for (int i = 0; i < arr.length; i++)
            nums[i + start] = arr[i];
    }


}
