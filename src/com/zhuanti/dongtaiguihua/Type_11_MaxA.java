package com.zhuanti.dongtaiguihua;

public class Type_11_MaxA {
    public void maxA(int N){
        int []x = new int[N+1];
        x[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            x[i] = x[i-1] + 1;
        }
    }
}
