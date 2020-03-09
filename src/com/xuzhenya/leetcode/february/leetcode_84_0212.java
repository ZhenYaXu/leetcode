package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 *
 * @author: xuzhenya
 * @date: 2020.02.13
 */
public class leetcode_84_0212 {
//    public int largestRectangleArea(int[] heights) {
//        int maxArea = 0;
//
//        return maxArea;
//    }
//
//    public int getMin(int[] heights,int left,int right) {
//        int[] temp = new int[right - left + 1];
//        int j = 0;
//        for (int i = left; i < right; i++) {
//            temp[j++] = heights[i];
//        }
//        Arrays.sort(temp);
//        return temp[0];
//    }

    public int calculateArea(int[] heights, int start, int end) {
        if (start > end)
            return 0;
        int minindex = start;
        for (int i = start; i <= end; i++)
            if (heights[minindex] > heights[i])
                minindex = i;
        return Math.max(heights[minindex] * (end - start + 1), Math.max(calculateArea(heights, start, minindex - 1), calculateArea(heights, minindex + 1, end)));
    }
    public int largestRectangleArea(int[] heights) {
        return calculateArea(heights, 0, heights.length - 1);
    }
}
