package com.chazhao.erfen;

public class Question02 {
    public static void solve(){
        double lo = 0,hi = 10001;
        for (int i = 0; i < 100; i++) {
            double mid = lo + ((hi - lo)/2);
//            if (C(mid)) lo = mid;
//            else hi = mid;
        }
        System.out.println();
    }

    public static boolean C(double c,int N,int L[]){
        int num = 0;
        for (int i = 0; i < N; i++) {
            num += (int)(L[i] / c);
        }
        return num >= 11;
    }
}
