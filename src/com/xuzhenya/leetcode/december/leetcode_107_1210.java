package com.xuzhenya.leetcode.december;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.10
 */
public class leetcode_107_1210 {
    List<List<Integer>> levels = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)   return null;
        int level = 0; // 记录当前层
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList();
            int size = queue.size(); //当前层有多少节点
            TreeNode node = queue.poll();
            for(int i = 0; i < size; i++) {
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            levels.add(list);
            level++;
        }
        Collections.reverse(levels);
        return levels;
    }



}


