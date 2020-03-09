package com.xuzhenya.leetcode.february;

import com.xuzhenya.leetcode.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/merge-two-binary-trees/
 *
 * @author: xuzhenya
 * @date: 2020.02.23
 */
public class leetcode_617_0223 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)   return null;

        if (t1 == null && t2 != null)   return t2;
        if (t1 != null && t2 == null)   return t1;
        int val = 0;
        if (t1 != null && t2 != null)   val = t1.val + t2.val;
        TreeNode root =  new TreeNode(val);
        root.left =  mergeTrees(t1.left,t2.left);
        root.right =  mergeTrees(t1.right,t2.right);
        return root;
    }
}
