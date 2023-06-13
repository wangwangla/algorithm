package com.zhuanti.doublepoint;

/**
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 说明：
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * 示例 2：
 *
 * 输入：haystack = "aaaaa", needle = "bba"
 * 输出：-1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _28_StrStr {

//    public int strStr(String haystack, String needle) {
//        haystack.indexOf(needle);
//        return 0;
//    }


    public int strStr(String haystack, String needle) {
        int length = haystack.length();
        int length1 = needle.length();
        char c = needle.charAt(0);
        int i = 0;
        for (i = 0; i < length; i++) {
            if (haystack.charAt(i) != c) {
                while (i<length-1&&haystack.charAt(++i)!=c);
            }
            if (i+needle.length()>length)return -1;
            int i1 = 0;
            for (i1 = 0; i1 < needle.length(); i1++) {
                if (haystack.charAt(i++)!=needle.charAt(i1)){
                    break;
                }
            }
            if (i1 == length1){
                return i - length1;
            }else {
                i = i-i1-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _28_StrStr strStr = new _28_StrStr();
//        System.out.println(strStr.strStr("hello", "ll"));
        System.out.println(strStr.strStr("mississippi",
                "pi"));

    }
}
