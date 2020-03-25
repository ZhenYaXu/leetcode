package com.xuzhenya.leetcode.match;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference/
 *
 * @author: xuzhenya
 * @date: 2020.03.19
 */
public class leetcode_1218_0319 {
    public int longestSubsequence(int[] arr, int difference) {
        if (arr.length == 1)    return 1;
        int[] dp = new int[arr.length];
        HashMap<String,Integer> map = new HashMap<>();

        return dp[arr.length - 1];
    }
}
