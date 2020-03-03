package com.xuzhenya.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/gas-station/
 *
 * @author: xuzhenya
 * @date: 2020.02.06
 */
public class leetcode_134_0206 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1, cur = 0;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i])   continue;
        }
        return 0;
    }
}
