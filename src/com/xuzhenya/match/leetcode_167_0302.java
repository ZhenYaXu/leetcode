package com.xuzhenya.match;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * @author: xuzhenya
 * @date: 2020.03.02
 */
public class leetcode_167_0302 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            }else {
                i++;
            }
        }
        return res;
    }
}
