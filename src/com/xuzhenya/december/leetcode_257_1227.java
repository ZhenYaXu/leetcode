package com.xuzhenya.december;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode-cn.com/problems/plus-one/
 *
 * @author: xuzhenya
 * @date: 2019.12.07
 */
public class leetcode_257_1227 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


//    public static void main(String[] args) {
//        leetcode_66_1221 test = new leetcode_66_1221();
//        int[] ints = test.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
//
//    }
//    public int[] plusOne(int[] digits) {
//        Long tmp = 1, val = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            val += digits[i] * tmp;
//            if (i != 0)
//                tmp *= 10;
//        }
//        val += 1;
//        int len = String.valueOf(val).length();
//        if (len > digits.length)
//            tmp = tmp * 10;
//        int[] res = new int[len];
//
//        for (int j = 0; j < len; j++) {
//            if (tmp == 0)
//                continue;
//            res[j] = (int) (val / tmp);
//            val = val % tmp;
//            tmp /= 10;
//        }
//        return res;
//    }
}


