package com.xuzhenya.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_14_0104 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)   return "";
        if (strs.length == 1 || strs[0].equals(""))   return strs[0];
        String res = "";
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i){
                    if (strs[0].charAt(i) != strs[j].charAt(i))
                        return res;
                }else {
                    return res;
                }
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}
