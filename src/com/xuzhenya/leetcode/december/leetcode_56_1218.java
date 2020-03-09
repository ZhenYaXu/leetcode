package com.xuzhenya.leetcode.december;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/merge-intervals/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_56_1218 {

    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        if (intervals == null || intervals.length == 0) {
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            if (res.isEmpty() || res.getLast()[1] < intervals[i][0]) {
                res.add(intervals[i]);
            } else {
                res.getLast()[1] = Math.max(res.getLast()[1], intervals[i][1]);
            }
        }

        //为什么放0，0长度？可以看下源码就知道了
        return res.toArray(new int[0][0]);
    }

//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0) return new int[][]{};
//        int[][] res = new int[intervals.length][intervals[0].length];
//        int j = 0;
//        int[] temp = new int[2];
//        //找到第1列中最小的一行
//        int min = Integer.MAX_VALUE, flag = 0;
//        for (int i = 0; i < intervals.length - 1; i++) {
//            if(intervals[i][0] < min){
//                min = intervals[i][0];
//                flag = i;
//            }
//        }
//        res[0] = intervals[flag];
//        // 遍历每一行数组
//        for (int i = 0; i < intervals.length; i++) {
//            if(i == flag)   continue;
//            if (res[j][1] >= intervals[i][0] && intervals[i][1] >= res[j][0]) { //需要合并区间
//                res[j][0] = intervals[i][0] < res[j][0] ? intervals[i][0] : res[j][0];
//                res[j][1] = intervals[i][1] > res[j][1] ? intervals[i][1] : res[j][1];
//            } else {
//                j++;
//                res[j][0] = intervals[i][0];
//                res[j][1] = intervals[i][1];
//            }
//        }
//        int[][] ans = new int[j+1][intervals[0].length];
//        for (int i = 0; i <= j; i++) {
//            ans[i] = res[i];
//        }
//        return ans;
//    }
}


