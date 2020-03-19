package com.xuzhenya.leetcode.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class leetcode_1013_0311 {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A == null || A.length == 0) return false;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) return false;
        sum /= 3;
        int tempA = A[0], tempB = A[A.length - 1];
        for (int i = 1, j = A.length - 2; i < j;) {
            if (tempA != sum)   tempA += A[i++];
            if (tempB != sum)   tempB += A[j--];
            if (tempA == sum && tempB == sum) {
                if (i <= j)  return true;
            }
        }
        return false;
    }
}
