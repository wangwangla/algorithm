package com.shuati.letcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class _3_LengthOfLongestSubstring {
    /**
     * 这个的解题思路：
     *  1.将String转化为char[]
     *  2.将char插入到map中，如果有重复就从第一个字母开始删除，直到不包括这个按钮为止。
     *  3.然后和max比较
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<Character,Integer>();
        char [] c = s.toCharArray();
        int max = 0;
        int index = 0;
        for(int i=0;i<c.length;i++) {
            if(!m.containsKey(c[i])) {
                m.put(c[i], 1);
            }else {
                while(m.size()>0&&m.containsKey(c[i])) {
                    m.remove(c[index]);
                    index++;
                }
                m.put(c[i], 1);
            }
            if(m.size()>max) {
                max = m.size();
            }
        }
        return max;
    }

    /**
     * 思路：
     *  开始初始化长度为0
     *  - 先获取到字母
     *  - 如果包含了，那么就重新找到开始位置
     *  - 否则就计算值，然后将字符存入，
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    public static void lengthOfLongestSubstring3(String s){
        int start = 0;
        int end = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chars = s.toCharArray();
        for (char m : chars) {
            if (map.containsKey(m)) {
                map.remove(chars[start]);
                max = Math.max(max, end - start);
                start++;
            }
            if (!map.containsKey(m)) {
                map.put(m, 1);
                end++;
            }
        }
        max = Math.max(max,end - start);
        System.out.println(max);
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        lengthOfLongestSubstring3(str);
    }
}
