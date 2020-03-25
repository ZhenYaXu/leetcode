package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.december.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.25
 */
public class offer_34_0325 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)   return res;
        backtrack(root,sum,new ArrayList());
        return res;
    }

    public void backtrack(TreeNode node, int target, List<Integer> temp) {
        if (node == null)   return;
        temp.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            res.add(new ArrayList<>(temp));
        }
        if (node.left != null)  backtrack(node.left, target, temp);
        if (node.right != null) backtrack(node.right, target, temp);
        temp.remove(temp.size() - 1);
    }
}
