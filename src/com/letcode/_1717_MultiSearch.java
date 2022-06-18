package com.letcode;

import com.sun.xml.internal.ws.api.ha.HaInfo;

import java.util.HashMap;

/**
 * 给定一个较长字符串big和一个包含较短字符串的数组smalls，设计一个方法，根据smalls中的每一个较短字符串，对big进行搜索。输出smalls中的字符串在big里出现的所有位置positions，其中positions[i]为smalls[i]出现的所有位置。
 *
 * 示例：
 *
 * 输入：
 * big = "mississippi"
 * smalls = ["is","ppi","hi","sis","i","ssippi"]
 * 输出： [[1,4],[8],[],[3],[1,4,7,10],[5]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/multi-search-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _1717_MultiSearch {
    public int[][] multiSearch(String big, String[] smalls) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String small : smalls) {
            hashMap.put(small,0);
        }
        for (char c : big.toCharArray()) {

        }
        return null;
    }
}
