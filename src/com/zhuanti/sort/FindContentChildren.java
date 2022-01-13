package com.zhuanti.sort;

import java.util.Arrays;

/**
 * 满足孩子
 *
 *
 * sort after，child content min g
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            while (j<s.length&&g[i]>s[j]){
                j++;
            }
            if (j<s.length){
                count++;
            }
        }
        return count;
    }
}
