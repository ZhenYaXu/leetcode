package com.xuzhenya.february;

import com.xuzhenya.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author: xuzhenya
 * @date: 2020.02.23
 */
public class leetcode_206_0223 {
    public ListNode reverseList(ListNode head) {
        if (head == null)   return null;
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            head.next = dummy.next;
            dummy.next = head;
            head = p;

        }
        return dummy.next;
    }
}
