package com.doul;

/**
 * 最小反转几次将start值变为goal。
 *
 * 1.一位一位移动，如果当前位的值不同就需要反转
 * 2.int一共存在32位，需要32此遍历（O(1)）
 */
public class _1_minBitFlips {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int i1 = (start)&1;
            start = start>>1;
            int i2 =(goal)&1;
            goal = goal>>1;
            if (i1!=i2){
                count ++;
            }
        }
        return count;
    }
}
