package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
 *
 * @author: xuzhenya
 * @date: 2020.03.12
 */
public class leetcode_1071_0312 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int len = gcd(str1.length(),str2.length());
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < len; i++) {
            sb.append(str1.charAt(i));
        }
        return sb.toString();
    }

    public int gcd(int a, int b) {
        int n = 0;
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}

