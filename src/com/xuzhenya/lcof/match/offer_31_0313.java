package com.xuzhenya.lcof.match;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class offer_31_0313 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int j = 0;
        for (int elem : pushed) {
            stack.push(elem);
            while (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}
