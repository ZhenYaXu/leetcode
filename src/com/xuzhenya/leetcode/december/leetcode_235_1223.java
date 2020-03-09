package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_235_1223 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left,p,q);
       if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right,p,q);
       return root;
    }
}


