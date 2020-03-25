package com.xuzhenya.leetcode.match;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.22
 */
public class leetcode_weekly_contest_181 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > index[i]; j--) {//插入位置的数往后移
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }

    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans += getAns(num);
        }
        return ans;
    }

    public int getAns(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
                if (set.size() > 4) return 0;
            }
        }

        if (set.size() != 4)    return 0;

        int ans = 0;
        for (Integer num :  set) {
            ans += num;
        }
        return ans;
    }



}
