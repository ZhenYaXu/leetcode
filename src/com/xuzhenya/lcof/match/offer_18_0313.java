package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class offer_18_0313 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null)   return null;
        if (head.val == val)    return head.next;

        ListNode node = head;
        ListNode pre = head;
        while (node != null) {
            if (node.val == val) {
                pre.next = node.next;
            }
            pre = node;
            node = node.next;
        }
        return head;
    }
}
