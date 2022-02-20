package com.labuladong._2_chaptertwo;

/**
 * 给不同的金币总额   使用函数来得到金币的组合数目，使得每个金额无限使用
 */
public class _221_CompletePack {
    public void completePack(int coins[],int target){
//        使用排列组合

    }

    /**
     * 一个背包的大小为target  怎么样才可以刚好装满
     * @param coins
     * @param target
     */
//    public void completePack1(int coins[],int target){
////        使用排列组合
//        int dp[] = new int[target+1];
//        dp[0] = 1;
//        for (int i = 1; i <= target; i++) {
//            for (int i1 = 0; i1 < coins.length; i1++) {
//                if (i>=coins[i1]){
//                    dp[i] =dp[i] + dp[i-coins[i1]];
//                }
//            }
//        }
//        for (int i : dp) {
//            System.out.println(i);
//        }
//        System.out.println(dp[target]);
//    }
//
     public void completePack1(int coins[],int target){
//        使用排列组合
        int dp[] = new int[target+1];
        dp[0] = 1;
        for (int i1 = 0; i1 < coins.length; i1++) {
            for (int i = 1; i <= target; i++) {
                if (i>=coins[i1]){
                    dp[i] =dp[i] + dp[i-coins[i1]];
                }
            }
        }
        for (int i : dp) {
            System.out.println(i);
        }
        System.out.println(dp[target]);
    }

    public void cc(int coins[],int target){
        int dp[] = new int[target+1];
        dp[0] = 0;
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i>=coin){
                    if (dp[i-coin]!=Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
        }

        for (int i : dp) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[]{1,2,5};
        _221_CompletePack completePack = new _221_CompletePack();
        completePack.completePack1(arr,5);
//        completePack.cc(arr,21);
    }


}
