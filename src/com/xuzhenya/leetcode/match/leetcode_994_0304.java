package com.xuzhenya.leetcode.match;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.04
 */
public class leetcode_994_0304 {
    public int orangesRotting(int[][] grid) {
        int res = 0;
        int[] p1 = {1, -1, 0, 0}, p2 = {0, 0, 1, -1};
        Deque<int[]> queue = new ArrayDeque();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    queue.offer(new int[]{i,j});
            }
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int[] temp = queue.poll();
                for (int j = 0; j < p1.length; j++) {
                    int x = temp[0] + p1[j], y = temp[1] + p2[j];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
            if (!queue.isEmpty()) {
                res++;
            }
        }

        for (int[] row: grid)
            for (int v: row)
                if (v == 1)
                    return -1;
        return res;
    }
}
