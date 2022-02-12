package com.algorithm._7_digui;

public class FeiBonaQie {
    public static void main(String[] args) {
        FeiBonaQie feiBonaQie = new FeiBonaQie();
//        arr = new int[11];
//        feiBonaQie.fanbi2(10);
//        System.out.println(feiBonaQie.num);

        int num = 10;
        int fanbi = feiBonaQie.fanbi(num);
        System.out.println(fanbi);
        feiBonaQie.dd1(num);
        System.out.println(feiBonaQie.temp2);

    }



    public static int arr[] ;
//  案例
    public int fanbi(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fanbi(n - 1) + fanbi(n-2);
    }

    /**
     * 递归的优化
     */
    public int num = 0;
    public void fanbi2(int n){
        num ++;
        if (n == 1 || n == 2){
            arr[n] = 1;
            return;
        }
        if (arr[n-1]==0)
        fanbi2(n-1);
        if (arr[n-2]==0)
        fanbi2(n-2);
        arr[n] = arr[n-1] + arr[n-2];
    }


    public void dd(int n) {
        if (n <= 0)return;
        if (n == 1 || n == 2){
            arr[n-1] = 1;
            return;
        }
        arr[n-1] = arr[n-2] + arr[n - 3];
    }

    int temp1 = 0;
    int temp2 = 0;
    int result = 0;
    public void dd1(int n) {
        if (n <= 0)return;
        if (n == 1 || n == 2){
            temp1 = 1;
            temp2 = 1;
            return;
        }
        dd1(n-1);
        result = temp1;
        temp1 = temp2;
        temp2 = result + temp2;
    }
}
