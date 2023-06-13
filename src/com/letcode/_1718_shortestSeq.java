package com.letcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 假设你有两个数组，一个长一个短，短的元素均不相同。找到长数组中包含短数组所有的元素的最短子数组，其出现顺序无关紧要。
 *
 * 返回最短子数组的左端点和右端点，如有多个满足条件的子数组，返回左端点最小的一个。若不存在，返回空数组。
 *
 * 示例 1:
 *
 * 输入:
 * big = [7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7]
 * small = [1,5,9]
 * 输出: [7,10]
 * 示例 2:
 *
 * 输入:
 * big = [1,2,3]
 * small = [4]
 * 输出: []
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shortest-supersequence-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _1718_shortestSeq {
    public int[] shortestSeq(int[] big, int[] small) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < small.length; i++) {
            hashMap.put(small[i],i);
        }
        int arr[] = new int[small.length];
        for (int i = 0; i < big.length; i++) {
            boolean b = hashMap.containsKey(big[i]);
//            if (b)
        }
        return null;
    }
}
