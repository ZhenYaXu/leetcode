package com.xuzhenya.lcof.match;

import com.xuzhenya.leetcode.december.TreeNode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 *
 * @author: xuzhenya
 * @date: 2020.03.14
 */
public class offer_32_0314 {
    public int[] levelOrder(TreeNode root) {
        if (root == null)   return new int[]{};
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            values.add(node.val);
            if (node.left != null)  queue.offer(node.left);
            if (node.right != null)  queue.offer(node.right);
        }
        int[] res = new int[values.size()];
        int k = 0;
        for (Integer value : values) {
            res[k++] = value;
        }
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)   return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null)  queue.offer(node.left);
                if (node.right != null)  queue.offer(node.right);
            }
            res.add(temp);
        }
        return res;
    }


    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)   return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode curNode =queue.poll();
                list.add(curNode.val);
                if(curNode.left != null)queue.add(curNode.left);
                if(curNode.right != null)queue.add(curNode.right);
            }
            if(level % 2 == 0)  Collections.reverse(list);
            res.add(list);
        }
        return res;
    }
}
