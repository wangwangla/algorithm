package com.zhuanti.dongtaiguihua;

public class BeiBao01 {
    public static void main(String[] args) {
        int w[] = {2,1,3,2};
        int v[] = {3,2,4,2};
        BeiBao01 beiBao01 = new BeiBao01();
        beiBao01.solution(w,v);
        System.out.println(beiBao01.nummm);
    }

    public void solution(int w[],int v[]){
        int arr[] = new int[5];
        dp = new int[w.length+2][w.length+2];
        System.out.println(rec2(0, 5, w.length, w, v));
    }

    /**
     *
     * 递归实现
     * @param i ：从哪一个开始
     * @param j ：总重量
     * @param length
     * @return
     */
    public int rec(int i,int j,int length,int w[],int v[]){
        int res;
        //拿到了末尾  那么就不拿了
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重了，  那么就拿去下一个
            res = rec(i+1,j,length,w,v);
        }else {//下来就是   下一个
            res = Math.max(rec(i+1,j,length,w,v),rec(i+1,j-w[i],length,w,v)+v[i]);
        }
        System.out.println(res);
        return res;
    }


    public int rec1(int i,int j,int length,int w[],int v[],int arr[]){
        int res;
        //拿到了末尾
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重的不要
            if (arr[i+1]!=0)
                res = arr[i+1];
            else
                res = rec1(i+1,j,length,w,v,arr);
        }else {//下来就是
            int i1 = 0;
            if (arr[i+1]!=0)
                i1 = arr[i+1];
            else {
                i1 = rec1(i + 1, j, length, w, v, arr);
            }
            int xx = i1 - w[i];
            res = Math.max(i1,rec1(i+1,j-w[i],length,w,v,arr)+v[i]);
        }
        arr[i] = res;
        return res;
    }

    int dp[][] ;
    int nummm = 0;
    public int rec2(int i,int j,int length,int w[],int v[]){
        nummm++;
        if (dp[i][j] != 0){
            return dp[i][j];
        }
        int res;
        //拿到了末尾
        if (i == length){
            return 0 ;
        }else if (j<w[i]){ // 重量太重的不要
            res = rec2(i+1,j,length,w,v);
        }else {//下来就是
            res = Math.max(rec2(i+1,j,length,w,v),rec2( i+1,j-w[i],length,w,v)+v[i]);
        }
//        System.out.println(res);
        dp[i][j] = res;
        return res;
    }

    public void soul(int M,int m[],int v[]){
        //我们创建数组，将重量进行罗列
        //重量
//        int dp[] = new int[M+1];
//        for (int i = 0; i <= M; i++) {
//            dp[i] = 0; //设置为0
//        }
//        for (int i = 0; i < m.length; i++) {
//
//        }
//        int dp[] = new int[M+1];
//        for (int i = 0; i < M + 1; i++) {
//            dp[i] = 0;
//        }
//        //一共有n个物品  加入取i个物品的时候，可以得到的最大重量。
//        for (int i = 0; i < m.length; i++) {
//            for (int j = M; j >= 0; j--) {
//                if (j>m[i]){
//                    dp[j] = Math.min(dp[j],dp[j-m[i-1]]+v[i-1]);
//                }
//            }
//        }
    }

    /**
     * 一个数组  将值放入到 一个包中  从中得到最接近的值
     * @param M
     * @param m
     */
    public void soul02(int M,int m[]){
        //m个物体
        int dp[][] = new int[m.length][M];
        for (int i = 0; i < M; i++) {
            dp[0][i] = 0;
        }

        for (int i = 0; i < m.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < m.length; i++) {
            for (int i1 = 1; i1 < M; i1++) {
                if (i1 < m[i-1]){
                    dp[i][i1] = dp[i-1][i1];
                }else {
                    dp[i][i1] = Math.max(dp[i-1][i1],dp[i-1][i1-m[i-1]]+m[i-1]);
                }
            }
        }
    }

}
