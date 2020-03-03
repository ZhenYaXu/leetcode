package com.xuzhenya.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/merge-sorted-array/
 *
 * @author: xuzhenya
 * @date: 2020.03.02
 */
public class leetcode_88_0302 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            nums1[index--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (i >= 0)
            nums1[index--] = nums1[i--];
        while (j >= 0)
            nums1[index--] = nums2[j--];
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        List<Integer> nums = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j])    nums.add(nums1[i++]);
//            else nums.add(nums2[j++]);
//        }
//        if (i == m - 1) {
//            for (int k = j; k < nums2.length; k++) {
//                nums.add(nums2[k]);
//            }
//        }else {
//            for (int k = i; k < nums1.length; k++) {
//                nums.add(nums1[k]);
//            }
//        }
//        int t = 0;
//        for (Integer num : nums) {
//            nums1[t++] = num;
//        }
//    }
}
