package com.xuzhenya.leetcode.match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.27
 */
public class leetcode_914_0327 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1)   return false;
        List<Integer> len = new ArrayList<>();
        Arrays.sort(deck);
        int temp = 1;
        for (int i = 1; i < deck.length; i++) {
            if(deck[i - 1] == deck[i]) {
                temp++;
            }else {
                len.add(temp);
                temp = 1;
            }
            if (i == deck.length - 1)   len.add(temp);
        }
        int k = len.get(0);
        for (int i = 1; i < len.size(); i++) {
            k = gcd(k,len.get(i));
            if(k < 2)  return false;
        }
        return true;
    }

    public int gcd(int x , int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
