package com.xuzhenya.match;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
 *
 * @author: xuzhenya
 * @date: 2020.03.02
 */
public class leetcode_524_0302 {
    public String findLongestWord(String s, List<String> d) {
        if (s == null || d == null) return null;
        Collections.sort(d, new Comparator <String> () {
            public int compare(String s1, String s2) {
                return s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2);
            }
        });

        for (String str : d) {
            if (isSubsequence(str,s))
                return str;
        }
        return "";
    }

    public boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++)
            if (x.charAt(j) == y.charAt(i))
                j++;
        return j == x.length();
    }
}
