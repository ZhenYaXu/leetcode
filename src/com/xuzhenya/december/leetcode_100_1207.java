package com.xuzhenya.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_100_1207 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == q)  return true;
        if(p == null || q == null)  return false;
        if(p.val != q.val)  return false;
        boolean isLeft = isSameTree(p.left,q.left);
        boolean isRight =isSameTree(p.right,q.right);
        return isLeft&&isRight;
    }



}


