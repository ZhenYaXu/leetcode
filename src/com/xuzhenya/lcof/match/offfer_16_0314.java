package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.14
 */
public class offfer_16_0314 {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastpow(x,n);
    }

    public double fastpow(double x, int n) {
        if (n == 0) return 1.0;
        if (n % 2 == 0) {
            double temp = fastpow(x, n / 2);
            return temp * temp;
        }else {
            double temp = fastpow(x, n / 2);
            return temp * temp * x;
        }
    }
}
