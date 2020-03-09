package com.xuzhenya.leetcode.february;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xuzhenya
 * @date: 2020.02.29
 */
public class leetcode_212_0229 {

    private int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    // 盘面上有多少行
    private int m;
    // 盘面上有多少列
    private int n;
    private String word;
    private char[][] board;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        this.board = board;

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        return res;
    }

    public void reverse(char[][] board, int i, int j, String word) {

    }


}
