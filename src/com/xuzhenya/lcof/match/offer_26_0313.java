package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.13
 */
public class offer_26_0313 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null)  return false;
        return helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right,B);
    }

    public boolean helper(TreeNode A, TreeNode B) {
        if (B == null)  return true;
        if (A == null)  return false;

        if (A.val == B.val) {
            return helper(A.left,B.left) && helper(A.right,B.right);
        }
        return false;
    }
}
