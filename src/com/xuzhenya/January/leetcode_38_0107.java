package com.xuzhenya.January;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/multiply-strings/
 *
 * @author: xuzhenya
 * @date: 2020.01.04
 */
public class leetcode_38_0107 {

    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }
        return str;
    }



//    public String countAndSay(int n) {
//        String res = "1211";
//        if (n == 1)  return "1";
//        if (n == 2)  return "11";
//        if (n == 3)  return "21";
//        for (int i = 5; i <= n; i++){
//            res = helper(res);
//        }
//        return res;
//    }
//
//    public String helper(String num){
//        int flag = 1;
//        String res = "";
//        for (int i = num.length() - 1; i >= 1; i--){
//            if (num.charAt(i) == num.charAt(i - 1)){
//                flag++;
//            }else {
//                res += (String.valueOf(flag) + num.charAt(i));
//                flag = 1;
//            }
//        }
//        return res;
//    }
}
