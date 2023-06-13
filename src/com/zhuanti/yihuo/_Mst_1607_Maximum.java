package com.zhuanti.yihuo;

public class _Mst_1607_Maximum {
    public int maximum(int a, int b) {
        int i = (a + b) / 2;
        int i1 = Math.abs(a - b) / 2;
        return i + i1;
    }
}
