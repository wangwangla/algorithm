package com.grindcode._10_weiys;

public class _461_HanmingDistance {
    /**
     * 异或  得到异或后结果
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x,int y){
        int i = x ^ y;
        int ans = 0;
        while (i!=0){
            ans += i & 1;
            i>>=1;
        }
        return ans;
    }
}
