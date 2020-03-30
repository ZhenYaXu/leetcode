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
public class UndergroundSystem {
    Map<String, HashMap<Integer, Integer>> inMap;
    Map<String, HashMap<Integer, Integer>> outMap;
    public UndergroundSystem() {
        this.inMap = new HashMap<>();
        this.outMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(id, t);
        inMap.put(stationName, map);
    }

    public void checkOut(int id, String stationName, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(id, t);
        outMap.put(stationName, map);
    }

    public double getAverageTime(String startStation, String endStation) {
        double sum = 0.0;
        int count = 0;
        HashMap<Integer, Integer> inUnderground = inMap.get(startStation);
        HashMap<Integer, Integer> outUnderground = outMap.get(startStation);
        for (Map.Entry<Integer, Integer> entry : outUnderground.entrySet()) {
            if (inUnderground.get(entry.getKey()) != null) {
                count++;
                sum += entry.getValue() - inUnderground.get(entry.getKey());
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}
