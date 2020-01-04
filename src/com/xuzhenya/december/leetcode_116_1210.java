package com.xuzhenya.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.10
 */
public class leetcode_116_1210 {
    public Node connect(Node root) {
        if (root == null)   return null;
        // 找到左子树中最右的节点
        Node left = getLeft(root);
        // 找到右子树中最左的节点
        Node right = getRight(root);
        left.next = right;
        helper(root);
        return root;
    }

    public void helper(Node node) {
        if(node == null)    return;
        if(node.left != null)
            node.left.next = node.right;
        helper(node.left);
        helper(node.right);
    }

    public Node getLeft(Node node) {
        Node tmp = new Node();
        while (node.right != null){
            tmp  = node;
            node = node.right;
        }
        return tmp.right;
    }

    public Node getRight(Node node) {
        Node tmp = new Node();
        while (node.right != null){
            tmp  = node;
            node = node.right;
        }
        return tmp.left;
    }
}


