package com.xuzhenya.february;

import com.xuzhenya.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.23
 */
public class leetcode_226_0223 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)   return null;

        TreeNode rightTree = root.right;

        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }
}
