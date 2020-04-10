package com.xuzhenya.leetcode.april;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author: xuzhenya
 * @date: 2020.04.01
 */
public class leetcode_20_0401 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[')  stack.add(temp);
            if (temp == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            if (temp == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
            if (temp == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
