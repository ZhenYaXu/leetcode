package com.xuzhenya.leetcode.match;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.29
 */
public class leetcode_weekly_contest_182 {
    public int findLucky(int[] arr) {
        int res = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                res = Math.max(res,entry.getKey());
            }
        }
        return res;
    }

    public int numTeams(int[] rating) {
        if (rating.length < 3)  return 0;
        int res = 0;
        int[] left = new int[rating.length];
        int[] right = new int[rating.length];

        left[0] = 0;
        right[rating.length - 1] = 0;
        for (int i = 1; i < rating.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) temp++;
            }
            left[i] = temp;
        }

        for (int i = rating.length - 2; i >= 0; i--) {
            int temp = 0;
            for (int j = rating.length - 1; j > i; j--) {
                if (rating[j] < rating[i]) temp++;
            }
            right[i] = temp;
        }
        for (int i = 0; i < rating.length; i++) {
            if (left[i] >= 2 || right[i] >= 2) {
                res += getValue(left[i]) + getValue(right[i]);
            }
        }
        return res;
    }

    public int getValue(int x) {
        return x * (x - 1) / 2;
    }

}
