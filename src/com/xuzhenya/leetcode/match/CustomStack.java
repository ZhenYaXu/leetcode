package com.xuzhenya.leetcode.match;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.15
 */
public class CustomStack {
    Stack<Integer> stack;
    Stack<Integer> help;
    int count = 0;
    public CustomStack(int maxSize) {
        this.stack = new Stack<>();
        this.help = new Stack<>();
        this.count = maxSize;
    }

    public void push(int x) {
        if (count > 0) {
            stack.push(x);
            count--;
        }
    }

    public int pop() {
        if (!stack.isEmpty()) {
            count++;
            return stack.pop();
        }
        return -1;
    }

    public void increment(int k, int val) {
        while (!stack.isEmpty()) {
            help.push(stack.pop());
        }
        while (!help.isEmpty()) {
            if (k-- > 0) {
                stack.push(help.pop() + val);
            }
            stack.push(help.pop());
        }
    }
}
