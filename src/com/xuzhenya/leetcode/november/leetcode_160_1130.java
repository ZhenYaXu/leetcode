package com.xuzhenya.leetcode.november;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * @author: xuzhenya
 * @date: 2019.11.30
 */
public class leetcode_160_1130 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int alen = getLength(headA);
        int blen = getLength(headB);
        if (alen < blen) {
            for (int i = 0; i < blen - alen; i++) {
                headB = headB.next;
            }
        } else {
            for (int i = 0; i < alen - blen; i++) {
                headA = headA.next;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headB;
    }

    public static int getLength(ListNode tmp) {
        int cnt = 0;
        while (tmp != null) {
            cnt++;
            tmp = tmp.next;
        }
        return cnt;
    }
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null)  return null;
//        int lenA = 0,lenB = 0,t;
//        ListNode p = headA,q = headB;
//        while (p != null && q != null) {
//            p = p.next;
//            q = q.next;
//            lenA++;
//            lenB++;
//        }
//        if(p == null){
//            t = lenB-lenA;
//            while(t-- >= 0){
//                headB = headB.next;
//            }
//            while (headB != null){
//                if (headB.val == headA.val)
//                    return headA;
//                headB = headB.next;
//                headA = headA.next;
//            }
//        }else {
//            t = lenA-lenB;
//            while(t-- >= 0){
//                headA = headA.next;
//            }
//            while (headA != null){
//                if (headA.val == headB.val)
//                    return headA;
//                headA = headA.next;
//                headB = headB.next;
//            }
//        }
//        return null;
//    }
}


