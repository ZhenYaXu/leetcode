package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 *
 * @author: xuzhenya
 * @date: 2020.03.01
 */
public class leetcode_309_0301 {

    public static void main(String[] args) {
        leetcode_309_0301 test = new leetcode_309_0301();
        test.maxProfit(new int[]{2,1,2,0,1});
    }
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int n = 0, tempA = 0, tempB = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit[n++] = prices[i] - prices[i - 1];
            }
        }
        if (n == prices.length - 1) {
            for (int i = 1; i < profit.length; i++) {
                tempA += profit[i];
            }
            return tempA;
        }
        for (int i = 0, j = 1; j < profit.length; i += 2, j += 2) {
            tempA += profit[i];
            tempB += profit[j];
        }
        return tempA > tempB ? tempA :tempB;
    }
}
