package com.shuati.offer;

/**
 * @author:28188
 * @date: 2021/4/5
 * @time: 8:36
 */
public class Question03 {
    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        if (s == null)return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c==' '){
                builder.append("%20");
            }else {
                builder.append(c);
            }

        }
        return builder.toString();
    }
}
