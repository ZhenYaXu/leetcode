package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_63_0316 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)   return 0;
        int profit = 0, temp_min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            temp_min = Math.min(prices[i],temp_min);
            profit = Math.max(profit, prices[i] - temp_min);
        }
        return profit;
    }
}
