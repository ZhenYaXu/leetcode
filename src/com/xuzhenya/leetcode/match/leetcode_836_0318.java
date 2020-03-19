package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/rectangle-overlap/
 *
 * @author: xuzhenya
 * @date: 2020.03.18
 */
public class leetcode_836_0318 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[2] > rec2[0] && rec1[3] > rec2[1] && rec1[0] < rec2[2] && rec1[1] < rec2[3])
            return true;
        return false;
    }
}
