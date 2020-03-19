package com.xuzhenya.lcof.match;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class CQueue {
    Stack<Integer> stack;
    Stack<Integer> help;
    public CQueue() {
        this.stack = new Stack();
        this.help = new Stack();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (help.empty()) {
            while (!stack.empty()) {
                help.push(stack.pop());
            }
        }

        return help.empty() ? -1 : help.pop();
    }
}
