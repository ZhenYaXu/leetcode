package com.xuzhenya.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_121_1207 {
    public int maxProfit(int[] prices) {
        int min_val = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < min_val) min_val = prices[i];
            res = Math.max((prices[i] - min_val),res);
        }
        return res;
    }
}


