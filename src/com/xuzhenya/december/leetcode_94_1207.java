package com.xuzhenya.december;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_94_1207 {
    List<Integer> res = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {

        helper(root);
        return res;
    }

    public void helper(TreeNode node) {
        if(node == null)    return;
        helper(node.left);
        res.add(node.val);
        helper(node.right);
    }
}


