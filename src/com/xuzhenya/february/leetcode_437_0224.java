package com.xuzhenya.february;

import com.xuzhenya.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/path-sum-iii/
 *
 * @author: xuzhenya
 * @date: 2020.02.24
 */
public class leetcode_437_0224 {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null)   return count;
        helper(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }

    public void helper(TreeNode root, int sum) {
        if (root == null)   return;
        sum -= root.val;
        if (sum == 0) count++;

        helper(root.left,sum);
        helper(root.right,sum);
    }
}
