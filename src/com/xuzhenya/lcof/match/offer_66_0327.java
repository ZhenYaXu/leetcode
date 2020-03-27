package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.27
 */
public class offer_66_0327 {
    public int[] constructArr(int[] a) {
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        left[0] = 1 ;
        right[a.length - 1] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }
        for (int i = 0; i < a.length; i++) {
            left[i] *= right[i];
        }
        return left;
    }
}
