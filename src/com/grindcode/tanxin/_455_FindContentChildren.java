package com.grindcode.tanxin;

import java.util.Arrays;

/**
 * 一群孩子
 * 一堆饼干
 * 每个孩子有一个饥饿值
 * 最多的孩子不挨饿
 *
 * [1,2]  孩子
 * [1,2,3]   糖果
 */
public class _455_FindContentChildren {
    public static int findContentChildren(int child[],int cookie[]){
        Arrays.sort(cookie);
        Arrays.sort(child);
        int count = 0;
        int childIndex = 0;
        int cookieIndex = 0;
//        while (child[childIndex])
        for (int i : cookie) {
            if (childIndex<child.length&&i>=child[childIndex]){
                count ++;
                childIndex++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int child[] = {1,2};
        int coolie [] = {1,2,3};
        System.out.println(findContentChildren(child, coolie));
    }
}




















