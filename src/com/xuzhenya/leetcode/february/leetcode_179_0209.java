package com.xuzhenya.leetcode.february;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.09
 */
public class leetcode_179_0209 {
//    public String largestNumber(int[] nums) {
//        StringBuilder sb = new StringBuilder();
//
//        for (String s :
//                    Arrays.stream(nums)
//                        .boxed()
//                        .map(Object::toString)
//                        .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
//                        .collect(Collectors.toList())) {
//            sb.append(s);
//        }
//
//        String result = sb.toString();
//        return result.startsWith("0") ? "0" : result;
//    }

    public String largestNumber(int[] nums) {
        if (nums.length == 0)   return "";
        String[] ans = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ans,new LargestNumberComparator());
        StringBuilder sb = new StringBuilder();
        for (String str : ans) {
            sb.append(str);
        }
        return sb.toString().startsWith("0") ? "0" : sb.toString();
    }


}

class LargestNumberComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o2 + o1).compareTo(o1 + o2);
    }
}