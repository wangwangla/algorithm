package com.algorithm.dongtaiguihua;

/**
 * k个抄写员超写n本书，使用的最短时间
 */
public class ChaoxieYuan {
    /**
     * 书被抄写完成
     * @param arr
     * @param K
     */
    public void soul(int arr[],int K){
        int n=arr.length;
        //创建数组  K个抄写员  n本书
        int f[][] = new int[K+1][n+1];
        int i,j,k;
        //0 本书 0 个人，结果为0
        f[0][0] = 0;
        for (i = 1; i <= n; i++) {
            //没有抄写员的时候为最大时间
            f[0][i] = Integer.MAX_VALUE;
        }

        int sum = 0;
        for (k = 0; k < K; k++) {
            //二维数组  K个抄写员
            for (i = 0; i < n; i++) {
                f[k][i] = Integer.MAX_VALUE;
                sum = 0;
                for (j=i;j>=0;j--){
                    //当前       本次的最大值   与  之前的数据   得到最大值          和当前可以取出的最小值
                    f[k][i] = Math.min(f[k][i],Math.max(f[k-1][j],sum));
                    if (j>0){
                        sum += arr[j-1];
                    }
                }
            }
        }
    }

    /**
     * k个抄写员抄写书
     * @param arr
     * @param K
     */
    public void soul1(int arr[],int K){
        int n=arr.length;
        //创建数组  K个抄写员  n本书
        int f[][] = new int[K+1][n+1];
        int i,j,k;
        //0 本书 0 个人，结果为0
        f[0][0] = 0;
        for (i = 1; i <= n; i++) {
            //没有抄写员的时候为最大时间
            f[0][i] = Integer.MAX_VALUE;
        }

        int sum = 0;
        for (k = 0; k < K; k++) {
            //二维数组  K个抄写员
            for (i = 0; i < n; i++) {
                f[k][i] = Integer.MAX_VALUE;
                sum = 0;
                for (j=i;j>=0;j--){
                    //当前       本次的最大值   与  之前的数据   得到最大值          和当前可以取出的最小值
                    f[k][i] = Math.min(f[k][i],Math.max(f[k-1][j],sum));
                    if (j>0){
                        sum += arr[j-1];
                    }
                }
            }
        }
    }

}
