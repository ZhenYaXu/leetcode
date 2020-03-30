package com.xuzhenya.leetcode.match;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.21
 */
public class leetcode_biweekly_contest_22 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    count++;
                    break;
                }
            }
        }
        return arr1.length - count;
    }


    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        boolean[][] res = new boolean[n][10];
        for (int i = 0; i < reservedSeats.length; i++) {
            res[reservedSeats[i][0]][reservedSeats[i][1]] = true;
        }

        for (int i = 0; i < n; i++) {
            if(dfs(res,i,1) && dfs(res,i,5)) {
                count += 2;
                continue;
            }
            else if(dfs(res,i,1) || dfs(res,i,3) || dfs(res,i,5)) {
                count++;
            }
        }
        return count;
    }

    public boolean dfs(boolean[][] res, int row, int col) {
        int count = 1;
        for (int j = row; j < 10; j++) {
            if (count == 4) return true;
            if (res[row][j])    return false;
            count++;
        }
        return false;
    }

    public int getKth(int lo, int hi, int k) {
        if (lo == hi)   return lo;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            map.put(i,step(i));
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet()); //转换为list
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() == o2.getValue() ? o1.getKey() - o2.getKey() : o1.getValue() - o2.getValue();
            }
        });
        return list.get(k - 1).getKey();
    }

    public int step(int x) {
        if (x == 1) return 0;
        if (x % 2 == 0) return step(x / 2) + 1;
        else  return step(x * 3 + 1) + 1;
    }

//    public int maxSizeSlices(int[] slices) {
//        if (slices.length == 1) return slices[0];
//
//        for (int i = 0; i < slices.length; i++) {
//
//        }
//    }
}
