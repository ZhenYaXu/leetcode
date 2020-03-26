package com.xuzhenya.leetcode.february;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/h-index/
 *
 * @author: xuzhenya
 * @date: 2020.02.10
 */
public class leetcode_274_0210 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[citations.length - 1 - i] > i) {
                h++;
            }
        }
        return h;
    }
}
