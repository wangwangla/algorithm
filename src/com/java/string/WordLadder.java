package com.java.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 * 每次转换只能改变一个字母。
 *
 * 转换过程中的中间单词必须是字典中的单词。
 *
 *  
 *
 * 说明:
 * 如果不存在这样的转换序列，返回 0。
 *
 * 所有单词具有相同的长度。
 *
 * 所有单词只由小写字母组成。
 *
 * 字典中不存在重复的单词。
 *
 */
public class WordLadder {
    public void ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hashSet = new HashSet<>(wordList);
        //需要包含末尾
        if (!hashSet.contains(endWord)) {
            return;
        }


        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                char[] words_chars = curr.toCharArray();
                for (int j = 0; j < words_chars.length; j++) {
                    char original_chars = words_chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        //相同的不需要变化    将之设置为
                        if (words_chars[j] == c) {
                            continue;
                        }
                        words_chars[j] = c;
                        String new_word = String.valueOf(words_chars);
                        if (new_word.equals(endWord)) {
//                            return level + 1;
                            System.out.println(level+1);
                        }
                        if (hashSet.contains(new_word)) {
                            hashSet.remove(new_word);
                            queue.offer(new_word);
                        }
                    }
                    words_chars[j] = original_chars;
                }
            }
            //一层是一步
            level++;
        }
        return ;

    }
}
