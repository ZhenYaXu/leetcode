package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/2-keys-keyboard/
 *
 * @author: xuzhenya
 * @date: 2020.03.19
 */
public class leetcode_650_0319 {
    public int minSteps(int n) {
        if (n == 1) return 0;

        int minfactor = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                minfactor = i;
                break;
            }
        }
        if (minfactor == 1) return n;
        return minfactor + minSteps(n / minfactor);
    }
}
