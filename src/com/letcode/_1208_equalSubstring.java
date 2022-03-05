package com.letcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 给你两个长度相同的字符串，s 和 t。
 *
 * 将 s 中的第 i 个字符变到 t 中的第 i 个字符需要 |s[i] - t[i]| 的开销（开销可能为 0），也就是两个字符的 ASCII 码值的差的绝对值。
 *
 * 用于变更字符串的最大预算是 maxCost。在转化字符串时，总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的。
 *
 * 如果你可以将 s 的子字符串转化为它在 t 中对应的子字符串，则返回可以转化的最大长度。
 *
 * 如果 s 中没有子字符串可以转化成 t 中对应的子字符串，则返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/get-equal-substrings-within-budget
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _1208_equalSubstring {
    public int equalSubstring(String s, String t, int maxCost) {
        int initLen = 0;
        int max = Integer.MIN_VALUE;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            int i1 = Math.abs(t.charAt(i) - s.charAt(i));
//            System.out.println(i1);

            if (maxCost - i1 >= 0) {
                maxCost -= i1;
                deque.offerFirst(i1);
                initLen++;
            }else {
                if (!deque.isEmpty()){
                    while (maxCost - i1 >= 0){
                        Integer integer = deque.removeFirst();
                        maxCost+=integer;
                        initLen--;
                    }
                }
            }
//            System.out.println(deque+ "---"+maxCost+"---"+t.charAt(i)+"---"+s.charAt(i));
            max = Math.max(max,initLen);
        }
//        System.out.println(max);
        return max;
    }
//"pxezla"
//        "loewbi"
//        25
    public static void main(String[] args) {
        String s = "pxezla";
        String t = "loewbi";
        int maxCost = 25;
        _1208_equalSubstring equalSubstring = new _1208_equalSubstring();
        equalSubstring.equalSubstring(s,t,maxCost);
    }
}
