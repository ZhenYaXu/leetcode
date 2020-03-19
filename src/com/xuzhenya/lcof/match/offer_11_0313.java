package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class offer_11_0313 {
    // 二分法
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (numbers[mid] > numbers[right])   left = mid + 1;
            else if (numbers[mid] < numbers[right]) right = mid;
            else right--;
        }
        return numbers[left];
    }
//    public int minArray(int[] numbers) {
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < numbers[i - 1])    return numbers[i];
//        }
//        return numbers[0];
//    }
}
