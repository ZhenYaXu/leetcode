package com.xuzhenya.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/is-subsequence/
 *
 * @author: xuzhenya
 * @date: 2019.11.08
 */
public class leetcode_392_1108 {
    public static void main(String[] args) {
        new leetcode_392_1108().isSubsequence("abc","ahbgdc");
    }
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length() == 0) return true;
        return helper(s,0,t,0);
    }
    public boolean helper(String s, int m, String t, int n) {
        if(m == s.length() - 1)
            return true;
        for(int i = n; i < t.length(); i++)
            if(t.charAt(i) == s.indexOf(m))
                helper(s,m+1,t,i+1);
        return false;
    }

}
