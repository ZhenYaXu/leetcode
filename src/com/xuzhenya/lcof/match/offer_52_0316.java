package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.november.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.16
 */
public class offer_52_0316 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p = headA , q = headB;
        int lenA = 0 , lenB = 0;
        while (p != null) {
            lenA++;
            p = p.next;
        }
        while (q != null) {
            lenB++;
            q = q.next;
        }
        int step = lenA > lenB ? lenA - lenB : lenB - lenA;
        if (lenA > lenB) {
            while (step-- > 0){
                headA = headA.next;
            }
        }else {
            while (step-- > 0){
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA.val == headB.val) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
