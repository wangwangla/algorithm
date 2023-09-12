package com.grindcode._2_tanxin;

import java.util.ArrayList;
import java.util.List;

/**
 * 切字母
 *
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表
 * 示每个字符串片段的长度的列表。
 *
 *  
 *
 * 示例：
 *
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-labels
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _763_PartitionLabels {
    //这个解法就比较巧妙了  找到最后一个出现位置  如果下标和顺序相同，那就分一次
    public List<Integer> partitionLabels(String s) {
        int maxpos[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            maxpos[s.charAt(i)-'a'] = i;
        }
        int start = 0, scannedCharMaxPos = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            //得到字符的位置
            int currentCharMaxPos = maxpos[s.charAt(i) - 'a'];
            scannedCharMaxPos = Math.max(scannedCharMaxPos, currentCharMaxPos);
            if (i == scannedCharMaxPos) {
                res.add(i - start + 1);
                start = i + 1;
            }
        }
        return res;
    }

    public List<Integer> partitionLabels1(String s) {
//        找到第一个，一直找到最后一个   在判断这个串中间的
        return null;
    }
}
