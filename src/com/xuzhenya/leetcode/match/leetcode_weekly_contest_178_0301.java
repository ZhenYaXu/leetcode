package com.xuzhenya.leetcode.match;

import com.xuzhenya.leetcode.december.TreeNode;
import com.xuzhenya.leetcode.november.ListNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.01
 */
public class leetcode_weekly_contest_178_0301 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

//    public String rankTeams(String[] votes) {
//        Map<Character,Map<Integer,Integer>> map = new HashMap();
//        String res;
//        if (votes.length == 1)  return votes[0];
//
//        for (String vote : votes) {
//            for (int i = 0; i < vote.length(); i++) {
//                Map<Integer,Integer> temp = new HashMap<>();
//                temp.put(i+1,1);
//                map.put(vote.charAt(i),temp);
//            }
//        }
//
//
//        return res;
//    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null)   return true;
        if (root == null)   return false;

        if (head.val == root.val) {
            boolean isSub = matchSubPath(head.next,root.left) || matchSubPath(head.next,root.right);
            if (isSub){
                // 匹配上了，返回true
                return true;
            }
        }
        return isSubPath(head,root.left) || isSubPath(head,root.right);
    }

    private boolean matchSubPath(ListNode head, TreeNode node){
        if (head == null)   return true;
        if (node == null)   return false;

        // 不相等的，无法匹配
        if (head.val != node.val){
            return false;
        }
        // 相等继续进入左右子树，和链表的next节点匹配
        return matchSubPath(head.next,node.left) || matchSubPath(head.next,node.right);
    }


    public static String rankTeams(String[] votes) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (String item : votes) {
            char[] arr = item.toCharArray();
            for (int i = 0; i < item.length(); i++) {
                if (map.containsKey(arr[i])) {
                    List<Integer> temp = map.get(arr[i]);
                    temp.add(item.length() - i);

                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(item.length() - i);
                    map.put(arr[i], temp);
                }
            }
        }

        List<Map.Entry<Character, List<Integer>>> list = map.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    List<Integer> order1 = entry1.getValue();
                    List<Integer> order2 = entry2.getValue();
                    Collections.sort(order1);
                    Collections.sort(order2);
                    for (int i = order1.size() - 1; i >= 0; i--) {
                        if (order1.get(i) != order2.get(i)) {
                            return order2.get(i).compareTo(order1.get(i));
                        }
                    }
                    return entry1.getKey().compareTo(entry2.getKey());
                }).collect(Collectors.toList());
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, List<Integer>> item : list) {
            res.append(item.getKey());
        }
        return res.toString();
    }


}
