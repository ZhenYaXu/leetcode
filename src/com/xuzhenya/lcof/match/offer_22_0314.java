package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.14
 */
public class offer_22_0314 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        int step = count - k;
        while (step-- > 0) {
            head = head.next;
        }
        return head;
    }
}
