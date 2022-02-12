package com.zhuanti;

public class CoinChange {
    public int coinChange(int arr[],int amount){
        if (amount == 0)return 0;
        if (amount < 0)return Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
//        做选择
        for (int i = 0; i < arr.length; i++) {
            int i1 = coinChange(arr, amount - arr[i]);
            if (i1 != Integer.MAX_VALUE) {
                res = Math.min(res,1+i1);
            }
        }
        return res != Integer.MAX_VALUE ? res:Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int arr[] = {1,3,5};
        System.out.println(coinChange.coinChange(arr, 11));
    }
}
