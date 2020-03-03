package com.xuzhenya.match;

import com.xuzhenya.december.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 *
 * @author: xuzhenya
 * @date: 2020.03.02
 */
public class leetcode_95_0302 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return createTree(1,n);
    }

    public List<TreeNode> createTree(int start,int end) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = createTree(start, i - 1);
            List<TreeNode> rightTree = createTree(i + 1, end);
            for (TreeNode leftNode : leftTree) {
                for (TreeNode rightNode : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
        }
        return res;
    }

}
