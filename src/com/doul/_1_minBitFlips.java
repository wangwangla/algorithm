package com.doul;

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
