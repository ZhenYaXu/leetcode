package com.xuzhenya.lcof.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class offer_13_0313 {
    int count = 0;
    boolean[][] visit;
    public int movingCount(int m, int n, int k) {
        visit = new boolean[m][n];
        dfs(m, n, k,0,0);
        return count;
    }

    public void dfs(int m, int n, int k, int x, int y) {
        if (x < m && x >= 0 && y>= 0 && y < n && calSum(x) + calSum(y) <= k && !visit[x][y]) {
            visit[x][y] = true;
            count++;
        }else {
            return;
        }
        dfs(m,n,k,x+1,y);
        dfs(m,n,k,x,y+1);
    }

    public int calSum(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
