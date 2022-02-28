package com.letcode;

import java.util.HashMap;
import java.util.logging.Handler;

/**
 * 有一个只含有 'Q', 'W', 'E', 'R' 四种字符，且长度为 n 的字符串。
 *
 * 假如在该字符串中，这四个字符都恰好出现 n/4 次，那么它就是一个「平衡字符串」。
 *
 *  
 *
 * 给你一个这样的字符串 s，请通过「替换一个子串」的方式，使原字符串 s 变成一个「平衡字符串」。
 *
 * 你可以用和「待替换子串」长度相同的 任何 其他字符串来完成替换。
 *
 * 请返回待替换子串的最小可能长度。
 *
 * 如果原字符串自身就是一个平衡字符串，则返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-the-substring-for-balanced-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ___1234_BalancedString {
    public static void main(String[] args) {
        System.out.println(balancedString("WWEQ ERQW QWWR WWER QWEQ"));
    }


    public static int balancedString1(String s) {
        int[] count = new int[26];
        int len = s.length();

        for (int i = 0; i < len; i++) {
            count[s.charAt(i) - 'A']++;
        }

        int left = 0, right = 0;
        int res = len;
        int average = len / 4;

        while (right < len) {
            //滑动窗口里进来一个元素 就把count里的这个值减1
            count[s.charAt(right) - 'A']--;
            //如果四个元素都符合要求 就计算最小值
            while (left < len && count['Q' - 'A'] <= average && count['W' - 'A'] <= average && count['E' - 'A'] <= average && count['R' - 'A'] <= average) {
                res = Math.min(res, right - left + 1);
                //移动左指针 看能不能缩小范围
                count[s.charAt(left) - 'A']++;
                left++;
            }
            right++;
        }

        return res;

    }

    public static int balancedString(String s) {
        int length = s.length();
        //每个的个数
        int i = length / 4;
        HashMap<Character,Integer> hashMap = new HashMap();
        for (char c : s.toCharArray()) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        int count = 0;
        for (Integer value : hashMap.values()) {
            if (value>i){
                count+=value - i;
            }
        }
        return count;
    }
}
