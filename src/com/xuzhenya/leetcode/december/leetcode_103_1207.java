package com.xuzhenya.leetcode.december;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_103_1207 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;
        boolean flag = false;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        // 记录当前在哪一层
        int level = 0;
        while ( !queue.isEmpty() ) {
            // 每一层都创建一个list 用于最后返回结果list<list>
            levels.add(new ArrayList<Integer>());

            //记录每一层的节点数量
            int level_length = queue.size();
            //对每一层进行遍历
            for(int i = 0; i < level_length; ++i) {
                TreeNode node = queue.remove();

                // 将元素添加进当前层的list
                levels.get(level).add(node.val);

                // 将当前层节点的子节点加入队列中
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            // 更新当前层数
            if(flag) Collections.reverse(levels.get(level));
            level++;
            flag = !flag;
        }
        return levels;
    }

}


