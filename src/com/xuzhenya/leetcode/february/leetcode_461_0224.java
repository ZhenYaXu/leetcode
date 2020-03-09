package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/hamming-distance/
 *
 * @author: xuzhenya
 * @date: 2020.02.24
 */
public class leetcode_461_0224 {
    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x^y);
        int ans = x ^ y;
        int count = 0;
        while (ans != 0) {
            if ((ans & 1) == 1) {
                count++;
            }
            ans = ans >> 1;
        }
        return count;
    }
}
