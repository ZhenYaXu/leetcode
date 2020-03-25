package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.21
 */
public class leetcode_365_0321 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z)  return false;
        if (z == 0 || x == z || y == z) return true;
        if (z % gcd(x,y) == 0)  return true;
        return false;
    }

    public int gcd(int x,int y){
        if(y == 0) return x;
        int r = x % y;
        return gcd(y,r);
    }
}
