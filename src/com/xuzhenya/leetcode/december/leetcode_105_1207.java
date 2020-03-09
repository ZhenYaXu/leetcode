package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_105_1207 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0)
            return null;
        // 在中序遍历中找根节点的位置
        TreeNode root = helper(preorder,inorder);
        return root;
    }

        public TreeNode helper(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = findIndex(preorder[0] , inorder);
        int[] leftInorder = getPartition(0,index - 1,inorder);
        int[] rightInorder = getPartition(index + 1,inorder.length - 1,inorder);
        int[] leftPrenorder = getPartition(1,index,preorder);
        int[] rightPreorder = getPartition(index + 1,preorder.length - 1,preorder);
        root.left = helper(leftPrenorder,leftInorder);
        root.right = helper(rightPreorder,rightInorder);
        return root;
    }

    public int findIndex(int x,int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if(nums[i] == x)
                return i;
        return -1;
    }

    public int[] getPartition(int start,int end,int[] nums) {
        int[] res = new int[end - start + 1];
        for (int i = start,j = 0; i <= end; i++,j++) {
            res[j] = nums[i];
        }
        return res;
    }

}


