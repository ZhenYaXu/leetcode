package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.november.ListNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.12
 */
public class offer_06_0312 {
    public int[] reversePrint(ListNode head) {
        if (head == null)   return new int[]{};
        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            res[i++] = stack.pop();
        }
        return res;
    }
}
