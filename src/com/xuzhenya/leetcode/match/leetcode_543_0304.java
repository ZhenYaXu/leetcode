package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/diameter-of-binary-tree/
 *
 * @author: xuzhenya
 * @date: 2020.03.04
 */
public class leetcode_543_0304 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)   return 0;
        int a =  depth(root.left) + depth(root.right);
        int b = diameterOfBinaryTree(root.left);
        int c = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(a,b),c);
    }
    public int depth(TreeNode root){
        if(root == null)  return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
