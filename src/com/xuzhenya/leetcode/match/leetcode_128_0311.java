package com.xuzhenya.leetcode.match;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/longest-consecutive-sequence/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class leetcode_128_0311 {
    public int longestConsecutive(int[] nums) {
        Set set = new HashSet();
        int max_len = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curLen = 1;

                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    curLen++;
                }
                max_len = Math.max(curLen,max_len);
            }
        }
        return max_len;
    }
}
