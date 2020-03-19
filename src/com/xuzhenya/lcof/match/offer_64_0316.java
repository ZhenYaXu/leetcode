package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/qiu-12n-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_64_0316 {
    public int sumNums(int n) {
        int sum = 0;
        boolean a = n > 0 && (sum += sumNums(n - 1)) > 0;
        return sum;
    }
}
