package com.xuzhenya.leetcode.april;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.04.09
 */
public class leetcode_22_0409 {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        backtrack(new StringBuffer(""),0,0,n);
        return res;
    }

    public void backtrack(StringBuffer str,int left, int right, int n) {
        if (str.length() == 2 * n) {
            res.add(str.toString());
            return;
        }

        if (left < n) {
            str.append('(');
            backtrack(str, left+1, right, n);
            str.deleteCharAt(str.length() - 1);
        }
        if (right < left) {
            str.append(')');
            backtrack(str, left, right+1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
