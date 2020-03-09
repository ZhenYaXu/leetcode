package com.xuzhenya.leetcode.January;

import com.xuzhenya.leetcode.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 *
 * @author: xuzhenya
 * @date: 2020.01.21
 */
public class leetcode_129_0121 {
    int res = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null)   return res;
        dfs(root,0);
        return res;
    }

    public void dfs(TreeNode root,int cur) {
        cur = cur * 10 + root.val;
        if (root.left == null && root.right == null) {
            res += cur;
            return;
        }
        if (root.left != null)  dfs(root.left,cur);
        if (root.right != null)  dfs(root.right,cur);
    }
}
