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
public class leetcode_74_1223 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)   return res;
        helper("",root);
        return res;
    }

    public void helper(String str,TreeNode node){
        if (node != null){
            str = str + String.valueOf(node.val);
            if(node.left == null && node.right == null){
                res.add(str);
            }
            str = str + "->";
            helper(str,node.left);
            helper(str,node.right);
        }
    }
}


