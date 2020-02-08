package com.xuzhenya.January;

import com.xuzhenya.december.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/binary-tree-right-side-view/
 *
 * @author: xuzhenya
 * @date: 2020.01.22
 */
public class leetcode_199_0122 {
    public List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)   return res;
        dfs(root,0);
        return res;
    }

    public void dfs(TreeNode root,int level) {
        if (root == null)   return;
        if (level == res.size())    res.add(root.val);
        dfs(root.right,level + 1);
        dfs(root.left,level + 1);
    }
}
