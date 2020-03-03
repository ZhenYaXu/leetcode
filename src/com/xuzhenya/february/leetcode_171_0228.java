package com.xuzhenya.february;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.28
 */
public class leetcode_171_0228 {
    public int titleToNumber(String s) {
        int count = 0;
        for (int i = 0,j = s.length() - 1; i < s.length(); i++,j--) {
            count += (s.charAt(i) - 'A' + 1) * (Math.pow(26,j));
        }
        return count;
    }
}
