package com.zhuanti.erfenchazhao;

import java.util.HashMap;

public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int i1 = 0; i1 < B.length; i1++) {
                hashMap.put(A[i]+B[i1],hashMap.getOrDefault(A[i]+B[i1],0)+1);
            }
        }
        int ans = 0;
        for (int i = 0; i < C.length; i++) {
            for (int i1 = 0; i1 < D.length; i1++) {
                if (hashMap.containsKey(-(C[i]+D[i1]))){
                    ans += hashMap.get(-(C[i]+D[i1]));
                }
            }
        }
        return ans;
    }
}
