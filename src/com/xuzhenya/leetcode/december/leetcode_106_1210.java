package com.xuzhenya.leetcode.december;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_106_1210 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = helper(postorder,inorder);
        return root;
    }

    public TreeNode helper(int[] postorder, int[] inorder) {
        if(postorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int index = findIndex(postorder[postorder.length - 1] , inorder);
        int[] leftInorder = getPartition(0,index - 1,inorder);
        int[] rightInorder = getPartition(index + 1,inorder.length - 1,inorder);
        int[] leftPostorder = getPartition(0,index - 1,postorder);
        int[] rightPostorder = getPartition(index,postorder.length - 2,postorder);
        root.left = helper(leftPostorder,leftInorder);
        root.right = helper(rightPostorder,rightInorder);
        return root;
    }

    // 在中序遍历中找根节点的位置
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


