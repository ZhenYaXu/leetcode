package com.xuzhenya.leetcode.february;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *
 * @author: xuzhenya
 * @date: 2020.02.10
 */
public class leetcode_349_0210 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> res = new HashMap();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            res.put(i,1);
        }
        for (int i : nums2) {
            if (res.get(i) != null) {
                set.add(i);
            }
        }
        int[] ans = new int[set.size()];
        int t = 0;
        for (Integer x : set) {
            ans[t++] = x;
        }
        return ans;
    }
}
