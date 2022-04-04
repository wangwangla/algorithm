package com.grindcode._2_tanxin;

import java.util.Arrays;

/**
 * 物尽其用
 *
 *
 * 一群孩子
 * 一堆饼干
 * 每个孩子有一个饥饿值
 * 最多的孩子不挨饿
 *
 * [1,2]  孩子
 * [1,2,3]   糖果
 *
 * 有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
 * 最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩
 * 子可以吃饱。
 *
 *
 * 每个孩子份分给可以拿取的最小值
 */
public class _455_FindContentChildren {
    public static int findContentChildren(int child[],int cookie[]){
        Arrays.sort(cookie);
        Arrays.sort(child);
        int childIndex = 0;
        for (int i : cookie) {
            if (childIndex<child.length&&i>=child[childIndex]){
                childIndex++;
            }
        }
        return childIndex;
    }

    public static void main(String[] args) {
        int child[] = {1,2};
        int coolie [] = {1,2,3};
        System.out.println(findContentChildren(child, coolie));
    }
}




















