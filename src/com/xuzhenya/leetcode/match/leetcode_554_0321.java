package com.xuzhenya.leetcode.match;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/brick-wall/
 *
 * @author: xuzhenya
 * @date: 2020.03.21
 */
public class leetcode_554_0321 {

    public int leastBricks(List <List< Integer >> wall) {
        HashMap< Integer, Integer > map = new HashMap < > ();
        for (List < Integer > row: wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum))
                    map.put(sum, map.get(sum) + 1);
                else
                    map.put(sum, 1);
            }
        }
        int res = wall.size();
        for (int key: map.keySet())
            res = Math.min(res, wall.size() - map.get(key));
        return res;
    }

//    public int leastBricks(List<List<Integer>> wall) {
//        int index = 0;
//        int min_len = Integer.MAX_VALUE;
//        for (List<Integer> list : wall) {
//            min_len = Math.min(min_len,list.size());
//        }
//        int[] arr = new int[min_len];
//        while (index < min_len) {
//            Map<Integer,Integer> map = new HashMap<>();
//            List<Integer> values = null;
//            for (List<Integer> list : wall) {
//                map.put(list.get(index),map.getOrDefault(list.get(index),0) + 1);
//            }
//            LinkedHashMap<Integer, Integer> sorted = map.entrySet()
//                    .stream()
//                    .sorted(comparingByValue())
//                    .sorted(Collections.reverseOrder(comparingByValue()))
//                    .collect(
//                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                                    LinkedHashMap::new));
//            arr[index++] = (int) sorted.values().toArray()[0];
//        }
//        Arrays.sort(arr);
//        return wall.size() - arr[min_len - 1];
//    }
}
