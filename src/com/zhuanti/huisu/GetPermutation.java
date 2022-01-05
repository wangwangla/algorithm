package com.zhuanti.huisu;

import java.util.ArrayList;

public class GetPermutation {
//    boolean f = false;
//    StringBuilder builder = new StringBuilder();
//    public String getPermutation(int n, int k) {
//        int vv [] = new int[n];
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        xx(n,arrayList,k,vv);
//        return builder.toString();
//    }
//
//    int index = 0;
//    public void xx(int n,ArrayList<Integer> arrayList,int k,int[] vv){
//        if (arrayList.size() == n){
//            index ++;
//            if (index == k){
//                f = true;
//                for (Integer integer : arrayList) {
//                    builder.append(integer);
//                }
//             }
//            return;
//        }
//        for (int i = 1; i <= n; i++) {
//            if (f)break;
//            if (vv[i-1] == 1)continue;
//            vv[i-1] = 1;
//            arrayList.add(i);
//            xx(n,arrayList,k,vv);
//            arrayList.remove(arrayList.size() - 1);
//            vv[i-1] = 0;
//        }
//    }

    boolean f = false;
    StringBuilder builder = new StringBuilder();
    public String getPermutation(int n, int k) {
        int vv [] = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        xx(n,arrayList,k,vv,1);
        return builder.toString();
    }

    int index = 0;
    public void xx(int n,ArrayList<Integer> arrayList,int k,int[] vv,int start){
        if (arrayList.size() == 2){
            System.out.println(arrayList.toString());
//            index ++;
//            if (index == k){
//                f = true;
//                for (Integer integer : arrayList) {
//                    builder.append(integer);
//                }
//            }
            return;
        }
        for (int i = start; i <= n; i++) {
            if (f)break;
            if (vv[i-1] == 1)continue;
            vv[i-1] = 1;
            arrayList.add(i);
            xx(n,arrayList,k,vv,i+1);
            arrayList.remove(arrayList.size() - 1);
            vv[i-1] = 0;
        }
    }
    public static void main(String[] args) {
        GetPermutation getPermutation = new GetPermutation();
        getPermutation.getPermutation(4,2);
    }
}
