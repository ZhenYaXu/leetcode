package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/reorder-list/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class leetcode_143_0311 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        //找中点，链表分成两个
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        //第二个链表倒置
        newHead = reverseList(newHead);

        //链表节点依次连接
        while (newHead != null) {
            ListNode temp = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }

    }

    private ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        head = head.next;

        tail.next = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }

        return tail;
    }

//    public void reorderList(ListNode head) {
//        if (head == null || head.next == null)   return;
//        int count = 1;
//        ListNode p = head;
//        while (p.next != null) {
//            count++;
//            p = p.next;
//        }
//        ListNode left = head, right = p;
//        while (left != right || left.next != right) {
//            right.next = left.next;
//            left.next = right;
//            left = left.next.next;
//            right = head;
//            while (--count > 0) {
//                right = right.next;
//            }
//        }
//    }
}
