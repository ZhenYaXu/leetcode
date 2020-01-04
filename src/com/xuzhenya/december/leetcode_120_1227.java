package com.xuzhenya.december;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.28
 */
public class leetcode_120_1227 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();

        lists.add(new ArrayList<Integer>(){{add(2);}});
        lists.add(new ArrayList<Integer>(){{add(3);add(4);}});
        lists.add(new ArrayList<Integer>(){{add(6);add(5);add(7);}});
        lists.add(new ArrayList<Integer>(){{add(4);add(1);add(8);add(3);}});


        System.out.println(minimumTotal(lists));

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] minlen = new int[row+1];
        for (int level = row-1;level>=0;level--){
            for (int i = 0;i<=level;i++){   //第i行有i+1个数字
                minlen[i] = Math.min(minlen[i], minlen[i+1]) + triangle.get(level).get(i);
            }
        }
        return minlen[0];
    }
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int res = 0,i = 0;
//        Integer[][] nums = new Integer[triangle.size()][];
//        for (List<Integer> list : triangle) {
//            list.toArray(nums[i];
//            int j = 0;
//            for (Integer num : list) {
//                nums[i][j] = triangle.get(i).get(j);
//            }
//        }
//        int min = Integer.MAX_VALUE;
//        int[][] dp = new int[nums.length][nums[0].length];
//        for (int m = 0; m < dp.length; m++){
//            for (int m = 0; m < dp.length; m++){
//
//            }
//        return res;
//    }
}
