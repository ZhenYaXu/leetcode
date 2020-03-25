package com.xuzhenya.lcof.match;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.25
 */
public class offer_50_0325 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc) {
            dic.put(c,dic.getOrDefault(c,0) + 1);
        }
        for(char c : sc) {
            if(dic.get(c) == 1) return c;
        }
        return ' ';
    }
}
