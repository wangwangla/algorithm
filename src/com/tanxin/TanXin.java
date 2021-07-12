package com.tanxin;

/**
 * 付款问题
 */
public class TanXin {
    public static void main(String[] args) {

    }

    /**
     * @param v :面值
     * @param c :拥有的钱币
     * @param target :目标
     */
    public void soulation(int v[],int c[],int target){
        int ans = 0;
        for (int i = 0; i < v.length; i++) {
            int t = Math.min(target/v[i],c[i]);
            target -= t * c[i];
            ans += t;
        }
    }
}
