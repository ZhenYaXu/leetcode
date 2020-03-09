package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.december.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 *
 * @author: xuzhenya
 * @date: 2020.03.04
 */
public class leetcode_538_0304 {
    int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            //遍历右子树
            convertBST(root.right);
            //遍历顶点
            root.val = root.val + num;
            num = root.val;
            //遍历左子树
            convertBST(root.left);
            return root;
        }
        return null;
    }
}
