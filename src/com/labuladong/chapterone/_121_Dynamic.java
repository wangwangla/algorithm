package com.labuladong.chapterone;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 1.base
 * 2.state
 * 3.select
 * 4.define dp
 */
public class _121_Dynamic {
    int fib(int n){
        if (n == 0)return 0;
        if (n == 1 || n == 2)return 1;
        int dp[] = new int[n+1];
        dp[1] = dp[2] = 1; //base
        //state
        for (int i = 3; i <= n; i++) {
            //selet
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    int coinChange(int []coins,int amount){
        int dp[] = new int[amount+1];
        dp[0] = 0;//初始值
        for (int i = 1; i <= amount; i++) {
            //当前值
            dp[i] = Integer.MAX_VALUE;
            for (int i1 = 0; i1 < coins.length; i1++) {
                if (i - coins[i1] <0)continue;
                if (dp[i - coins[i1]] == Integer.MAX_VALUE){
                    continue;
                }
                dp[i] = Math.min(dp[i - coins[i1]]+1,dp[i]);
            }
        }
        return dp[amount];
    }

    int coinChange3(int []coins,int amount){
        ArrayList<Integer> arrayList = new ArrayList<>();
        cc(coins,amount,arrayList);
        return 0;
    }

    public void cc(int arr[], int target, ArrayList<Integer> arrayList){
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            count += arrayList.get(i);
        }
        if (count == target){
            System.out.println("找到了 --------"+ arrayList.size());
            return;
        }
        if (count>target)return;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
            cc(arr,target,arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5};
        _121_Dynamic dynamic = new _121_Dynamic();
        dynamic.coinChange3(arr,11);
    }
}
