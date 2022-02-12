package com.zhuanti.tanxin;

/**
 * 不段的获取最优解
 */
public class Tanx {
    public static void main(String[] args) {

    }

    /**
     * 题目：
     *  1  5  10  50  100  支付A 最少多少硬币
     */
    public void demo01(int arr[],int A){
//        先拿出最大的   不断的选取当前最优
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            //拿出当前币的个数
            int t = Math.min(A/arr[i],arr[i]);
            A -= t*arr[i];
            ans += t;
        }
        System.out.println(ans);
    }

//    区间问题
    /*
    * 每个工作在t1开始  t2结束  参与工作不能重叠
    * 问:尽可能多的参与
    * 1.选择开始时间最早的工作,存在问题
    * 2.结束最早的,时长最短的
    * */
    public void sou(){
        int[][] arr = new int[10][2];
        int ans = 0,t = 0;
        for (int i = 0; i < 10; i++) {
            if (t<arr[i][1]){
                ans ++;
                t = arr[i][0];
            }
        }
    }

}
