package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.30
 */
public class offer_62_0330 {
    public int lastRemaining(int n, int m) {
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
