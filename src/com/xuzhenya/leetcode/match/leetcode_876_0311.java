package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class leetcode_876_0311 {
    // 快慢指针找中点
    public ListNode middleNode(ListNode head) {
        if (head == null)   return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
