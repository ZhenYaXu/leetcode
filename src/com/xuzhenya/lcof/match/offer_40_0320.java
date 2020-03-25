package com.xuzhenya.lcof.match;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.03.20
 */
public class offer_40_0320 {

    // 快排思想求topK问题
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0)   return new int[]{};

        return quicksearch(arr,0,arr.length - 1,k);
    }

    public int[] quicksearch(int[] arr, int start, int end, int k) {
        int p = quicksort(arr,start,end);
        if (p == k) return Arrays.copyOfRange(arr,0,k);
        else if (p < k) return quicksearch(arr,p + 1, end,k);
        else return quicksearch(arr,start, p - 1,k);
    }

    public int quicksort(int[] arr, int start, int end) {
        int i = start, j = end;
        int flag = arr[start];
        while (i <= j) {
            while (++i < j && arr[i] < flag);
            while (j-- > i && arr[i] > flag);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[start] = arr[i];
        arr[i] = flag;
        return i;
    }





    public int[] getLeastNumbers2(int[] arr, int k) {
        if (arr.length == 0 || k == 0)   return new int[]{};
        // 创建大根堆
        Queue<Integer> queue = new PriorityQueue<>((v1,v2) -> v2 - v1);
        for (int val : arr) {
            if (queue.size() < k)   queue.offer(val);
            else if (val < queue.peek()){
                queue.poll();
                queue.offer(val);
            }
        }

        int[] res = new int[queue.size()];
        int i = 0;
        for (Integer num : queue) {
            res[i++] = num;
        }
        return res;
    }
}
