package com.xuzhenya.leetcode.february;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/daily-temperatures/
 *
 * @author: xuzhenya
 * @date: 2020.02.27
 */
public class leetcode_739_0227 {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        res[T.length - 1] = 0;
        for (int i = T.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < T.length; j += res[j]) {
                if (T[i] < T[j]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) {
                    res[i] = 0;
                    break;
                }
            }
        }
        return res;
    }

//    public int[] dailyTemperatures(int[] T) {
//        int[] ans = new int[T.length];
//        Stack<Integer> stack = new Stack();
//        for (int i = T.length - 1; i >= 0; --i) {
//            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
//            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
//            stack.push(i);
//        }
//        return ans;
//    }
}
