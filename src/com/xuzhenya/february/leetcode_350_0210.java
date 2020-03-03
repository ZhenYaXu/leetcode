package com.xuzhenya.february;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 *
 * @author: xuzhenya
 * @date: 2020.02.10
 */
public class leetcode_350_0210 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> res = new HashMap();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            res.put(i,res.getOrDefault(i,0) + 1);
        }
        for (int i : nums2) {
            if (res.get(i) != null && res.get(i) > 0) {
                list.add(i);
                res.put(i,res.get(i) - 1);
            }
        }
        int[] ans = new int[list.size()];
        int t = 0;
        for (Integer x : list) {
            ans[t++] = x;
        }
        return ans;
    }
}
