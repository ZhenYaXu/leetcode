package com.xuzhenya.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/palindromic-substrings/
 *
 * @author: xuzhenya
 * @date: 2020.02.27
 */
public class leetcode_647_0227 {

    int count = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            helper(s,i,i);  // 字符串长度为奇数
            helper(s,i,i+1);    // 字符串长度为奇数
        }
        return count;
    }

    public void helper(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }



//    public int countSubstrings(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                if (isPalindromic(s.substring(i,j)))    count++;
//            }
//        }
//        return count;
//    }
//
//    public boolean isPalindromic(String str) {
//        for (int i = 0, j = str.length() - 1; i < j; i++,j--) {
//            if (str.charAt(i) != str.charAt(j)) return false;
//        }
//        return true;
//    }

}
