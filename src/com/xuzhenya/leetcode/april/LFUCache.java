package com.xuzhenya.leetcode.april;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.04.05
 */
public class LFUCache {
    HashMap<Integer,Integer> map;
    HashMap<Integer,Integer> helper;
    int capacity;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity);
        this.helper = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (!map.isEmpty() && map.get(key) != null) {
            int val = map.get(key);
            map.remove(key);
            map.put(key,val);
            helper.put(key,helper.get(key) + 1);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.size() >= capacity) {
            ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList(helper.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }
            });
            int val = list.get(0).getValue();
            List<Integer> keys = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : list) {
                if (entry.getValue() == val)   keys.add(entry.getKey());
            }
            for (Integer i : map.keySet()) {
                for (Integer num : keys) {
                    if (i == num) {
                        map.remove(i);
                        break;
                    }
                }
            }
        }
        map.put(key,value);
        helper.put(key,0);
    }
}


