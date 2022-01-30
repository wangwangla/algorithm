package com.zhuanti.tanxin;

import java.util.Arrays;

public class _455_FindContentChildren {
    /**
     *有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
     * 最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩
     * 子可以吃饱。
     *
     * 是的饼干不浪费，最小的饼干，只满足最小的那个孩子
     *
     * @param child
     * @param cookies
     * @return
     */
    public int findContentChildren(int child[],int cookies[]){
        Arrays.sort(child);
        Arrays.sort(cookies);
        int childNum = child.length;
        int cookieNum = cookies.length;
        int chilIndex = 0;
        int cookieIndex = 0;
        while (chilIndex<childNum && cookieIndex<cookieNum){
            if (child[chilIndex] <= cookies[cookieIndex]){
                chilIndex ++;
            }
            cookieIndex++;
        }
        return chilIndex;
    }
}
