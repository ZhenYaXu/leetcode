package com.xuzhenya.leetcode.february;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.23
 */
public class leetcode_142_0223 {
    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> visited = new HashSet<ListNode>();
//
//        ListNode node = head;
//        while (node != null) {
//            if (visited.contains(node)) {
//                return node;
//            }
//            visited.add(node);
//            node = node.next;
//        }
//
//        return null;

        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            ListNode q = head;
            while (q != slow) {
                q = q.next;
                slow = slow.next;
            }
            return q;
        }
        return null;
    }
}
