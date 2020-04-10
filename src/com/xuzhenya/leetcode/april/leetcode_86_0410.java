package com.xuzhenya.leetcode.april;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.04.10
 */
public class leetcode_86_0410 {
    public ListNode partition(ListNode head, int x) {
        if (head == null)   return null;
        ListNode l = new ListNode(0);
        ListNode h = new ListNode(0);
        ListNode p = l, q = h;
        while (head != null) {
            if (head.val < x) {
                p.next = head;
                p = head;
                head = head.next;
            }else {
                q.next = head;
                q = head;
                head = head.next;
            }
        }
        q.next = null;
        p.next = h.next;
        return l.next;
    }
}
