package com.xuzhenya.leetcode.match;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/short-encoding-of-words/
 *
 * @author: xuzhenya
 * @date: 2020.03.28
 */
public class leetcode_820_0328 {
    public int minimumLengthEncoding(String[] words) {
        if (words.length == 1)  return words[0].length() + 1;
        int count = 0;
        boolean[] flag = new boolean[words.length];
        Arrays.fill(flag,false);
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (int i = 0; i < words.length; i++) {
            if (flag[i])    continue;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].endsWith(words[j])) flag[j] = true;
            }
            if (!flag[i]) count += words[i].length() + 1;
        }
        return count;
    }
}
