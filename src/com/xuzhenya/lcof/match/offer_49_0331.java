package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/chou-shu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.31
 */
public class offer_49_0331 {
    public int nthUglyNumber(int n) {
        int [] ugly = new int[n];
        ugly[0] = 1;    //第一个丑数为 1
        int i = 0, j = 0, k = 0;
        for (int m = 1; m < n; m++) {
            int temp = Math.min(2 * ugly[i], Math.min(3 * ugly[j],5 * ugly[k]));
            if (temp == ugly[i] * 2)    i++;
            if (temp == ugly[j] * 3)    j++;
            if (temp == ugly[k] * 5)    k++;
            ugly[m] = temp;
        }
        return ugly[n - 1];
    }
}
