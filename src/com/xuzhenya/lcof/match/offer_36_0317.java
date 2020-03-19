package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.december.Node;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.17
 */
public class offer_36_0317 {
    Node pre = null , head = null;
    public Node treeToDoublyList(Node root) {
        if (root == null)   return null;
        inorder(root);
        pre.right=head;
        head.left=pre;
        return head;
    }

    public void inorder(Node node) {
        if (node == null)   return;
        inorder(node.left);
        node.left = pre;
        if (pre == null)    head = node;
        else pre.right = node;
        pre = node;
        inorder(node.right);
    }
}
