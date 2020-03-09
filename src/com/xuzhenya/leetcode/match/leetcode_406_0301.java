package com.xuzhenya.leetcode.match;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.01
 */
public class leetcode_406_0301 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[0] - o1[0] : o1[1] - o2[1];
            }
        });

        List<int[]> res = new LinkedList();
        for (int[] person : people) {
            res.add(person[1],person);
        }

        return res.toArray(new int[people.length][2]);
    }
}
