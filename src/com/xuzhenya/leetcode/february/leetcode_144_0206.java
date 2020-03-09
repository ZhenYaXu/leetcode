package com.xuzhenya.leetcode.february;

import com.xuzhenya.leetcode.december.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 *
 * @author: xuzhenya
 * @date: 2020.02.06
 */
public class leetcode_144_0206 {

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        if (root == null)   return res;
//        preorder(root,res);
//        return res;
//    }
//
//    public void preorder(TreeNode root,List<Integer> res) {
//        if (root == null)   return;
//        res.add(root.val);
//        preorder(root.left,res);
//        preorder(root.right,res);
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(Integer.valueOf(node.val));
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
