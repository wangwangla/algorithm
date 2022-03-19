package com.grindcode._10_weiys;

public class _190_ReverseBit {
    public int reverseBit(int n){
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans<<=1;
            ans+=n&1;
            n>>=1;
        }
        return ans;
    }
}
