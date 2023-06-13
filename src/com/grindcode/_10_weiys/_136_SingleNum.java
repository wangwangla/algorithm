package com.grindcode._10_weiys;

public class _136_SingleNum {
    private int singleNum(int []arr){
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
