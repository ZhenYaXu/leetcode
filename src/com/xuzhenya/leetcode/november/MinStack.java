package com.xuzhenya.leetcode.november;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/min-stack/
 *
 * @author: xuzhenya
 * @date: 2019.11.30
 */
public class MinStack {

    // 数据栈
    private Stack<Integer> data;
    // 辅助栈
    private Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    // 思路 1：数据栈和辅助栈在任何时候都同步

    public void push(int x) {
        // 数据栈和辅助栈一定会增加元素
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        // 两个栈都得 pop
        if (!data.isEmpty()) {
            helper.pop();
            data.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        return -1;
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        return -1;
    }
}
