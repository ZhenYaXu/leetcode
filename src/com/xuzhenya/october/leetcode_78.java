package com.xuzhenya.october;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/subsets/submissions/
 * @author: xuzhenya
 * @date: 2019.10.29
 *
 */
public class leetcode_78 {
    List<List<Integer>> res= new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        //res.add(new ArrayList<>());
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        res.add(list);
        for(int i = 0; i < len; i++)
            helper(len,0,i,nums,new ArrayList<>());
        return res;
    }

    public void helper(int n,int start,int k,int[] nums,List<Integer> tmp) {
        if(k == 0)  res.add(new ArrayList<>(tmp));
        for(int i = start; i < n; i++){
            tmp.add(nums[i]);
            helper(n,i+1,k-1,nums,tmp);
            tmp.remove(tmp.size()-1);
        }

    }
}
