package com.xuzhenya.leetcode.february;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/valid-anagram/
 *
 * @author: xuzhenya
 * @date: 2020.02.10
 */
public class leetcode_242_0209 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())   return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}
