package com.xuzhenya.leetcode.match;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.17
 */
public class leetcode_1160_0317 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap();
        int res = 0;
        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0) + 1);
        }
        for (String word : words) {
            Map<Character,Integer> temp = new HashMap();
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (map.get(word.charAt(i)) == null) {
                    flag = false;
                    break;
                }
                temp.put(word.charAt(i),temp.getOrDefault(word.charAt(i),0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
                if (map.get(entry.getKey()) == 0 || map.get(entry.getKey()) < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag)   res += word.length();
        }
        return res;
    }
}
