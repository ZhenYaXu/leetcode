package com.xuzhenya.leetcode.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/decode-ways/
 *
 * @author: xuzhenya
 * @date: 2019.11.04
 */
public class leetcode_91_1104 {
    public int numDecodings(String s) {
        return getCounts(0,s);
    }

    public int getCounts(int index, String s) {
        // 结束条件
        if (index == s.length()) {
            return 1;
        }

        if (s.charAt(index) == '0') {
            return 0;
        }

        int ans1 = getCounts(index+1,s);
        int ans2 = 0;
        if (index < s.length() - 1) {
            if (Integer.parseInt(String.valueOf(s.charAt(index))) * 10 + Integer.parseInt(String.valueOf(s.charAt(index + 1))) <= 26)
                ans2 = getCounts(index+2,s);
        }
        return ans1 + ans2;
    }
}
