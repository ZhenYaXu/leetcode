package com.xuzhenya.leetcode.match;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/longest-palindrome/
 *
 * @author: xuzhenya
 * @date: 2020.03.19
 */
public class leetcode_409_0319 {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int count = 0 , flag = 0;
        for (Integer value : values) {
            if (value == 1) {
                count += value;
                break;
            }
            count += value / 2 * 2;
        }
        return count;
    }
}
