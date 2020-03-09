package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/reverse-words-in-a-string/
 *
 * @author: xuzhenya
 * @date: 2020.02.06
 */
public class leetcode_151_0206 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        StringBuffer res = new StringBuffer("");
        for (String word : words) {
            if (word.trim().equals(""))   continue;
            res = new StringBuffer(word).append(" ").append(res);
        }
        return res.toString().trim();
    }
}
