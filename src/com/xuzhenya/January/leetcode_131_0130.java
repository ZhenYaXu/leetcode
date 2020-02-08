package com.xuzhenya.January;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/palindrome-partitioning/
 *
 * @author: xuzhenya
 * @date: 2020.01.30
 */
public class leetcode_131_0130 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s,0,s.length(),new ArrayDeque<>());
        return res;
    }

    public void backtrack(String str, int start, int end, Deque<String> path) {
        if (start == end) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < end; i++) {
            if (!isValid(str,start,i))   continue;

            path.addLast(str.substring(start,i + 1));
            backtrack(str,i + 1,end,path);
            path.removeLast();
        }
    }

    public boolean isValid(String str,int left, int right) {
        for (int i = left, j = right; i < j; i++,j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

}
