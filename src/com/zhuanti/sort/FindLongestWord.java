package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个字符串 s 和一个字符串数组 dictionary ，找出并返回 dictionary 中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 *
 * 如果答案不止一个，返回长度最长且字母序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 524. 通过删除字母匹配到字典里最长单词
 */
public class FindLongestWord {

// * 找到所有的字母
// *
    public String findLongestWord(String s, List<String> dictionary) {
        for (int i = 0; i < dictionary.size(); i++) {
            String s1 = dictionary.get(i);
            char[] chars = s1.toCharArray();
            int dex = 0;
            for (char aChar : chars) {
                for (char c : s.toCharArray()) {
                    if (aChar == c){
                        dex++;
                        break;
                    }
                }
            }
            if (dex == chars.length){
                System.out.println(s1);
            }
        }
        return null;
    }

    public String findLongestWord1(String s, List<String> dictionary) {
        int arr[] = new int[dictionary.size()];
        for (int i = 0; i < dictionary.size(); i++) {
            String s1 = dictionary.get(i);
            char[] chars = s1.toCharArray();
            int dex = 0;
            for (char aChar : chars) {
                for (char c : s.toCharArray()) {
                    if (aChar == c){
                        dex++;
                        break;
                    }
                }
            }
            if (dex == chars.length){
                System.out.println(s1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String []dictionary = {"ale","apple","monkey","plea"};
//        List<String> list = new ArrayList<String>(dictionary);
        List<String> list = Arrays.asList(dictionary);

        String xx = "abpcplea";
        FindLongestWord word = new FindLongestWord();
        word.findLongestWord(xx,list);
    }
}
