package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.december.TreeNode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.11
 */
public class offer_07_0311 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null
                || preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = findIndex(inorder, preorder[0]);

        root.left = buildTree(Arrays.copyOfRange(preorder,1,index + 1),Arrays.copyOfRange(inorder,0,index));
        root.right = buildTree(Arrays.copyOfRange(preorder,index + 1,preorder.length),Arrays.copyOfRange(inorder,index + 1,inorder.length));
        return root;
    }

    public int findIndex(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target)   return i;
        }
        return 0;
    }
}
