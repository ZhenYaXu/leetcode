package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.27
 */
public class offer_67_0327 {
    public int strToInt(String str) {
        if(str.trim().equals("") || str == null) return 0;
        str = str.trim();
        if (str.length() == 1)
            return str.charAt(0) == '-' || str.charAt(0) == '+' ? 0 : str.charAt(0) - '0';
        int start = 0, end = 0 , flag = 0;
        if (isValid(str.charAt(0))) {
            if (str.charAt(0) >= '1' && str.charAt(0) <= '9') {
                flag = 1;
                start = 0;
            }
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) >= '1' && str.charAt(i) <= '9' && flag == 0) {
                    start = i;
                    flag = 1;
                }
                if (start > 1)  return 0;
                if (!isValid(str.charAt(i)) || i == str.length() - 1) {
                    end = (i == str.length() - 1 && str.charAt(i) >= '0' && str.charAt(i) <= '9') ? i + 1 : i;
                    if (end - start > 11) {
                        int val = (str.charAt(0) == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                        return val;
                    }
                    if (str.charAt(0) == '-')
                        return (int) Math.max(Integer.MIN_VALUE,-Long.valueOf(str.substring(start,end)));
                    else
                        return (int) Math.min(Integer.MAX_VALUE,Long.valueOf(str.substring(start,end)));
                }
            }

        }
        return 0;
    }

    public boolean isValid(char c) {
        if ((c >= '0' && c <= '9') || c == '-' || c == '+') return true;
        return false;
    }
}

