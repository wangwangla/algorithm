package com.zhuanti.huisu;

import java.util.ArrayList;

public class HuiSU {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        HuiSU huiSU = new HuiSU();
        huiSU.huisu2(0, 0, arr);
        System.out.println(huiSU.num);
    }

    int num = 0;
    boolean flag = false;

    public void huisu(ArrayList<Integer> arrayList, int start, int arr[]) {
        if (flag) return;
        int xx = 0;
        for (Integer integer : arrayList) {
            num++;
            xx += integer;
        }
        if (xx == 13) {
            flag = true;
            return;
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            num++;
            huisu(arrayList, i + 1, arr);
            if (flag) return;
            arrayList.remove(arrayList.size() - 1);
        }
    }


    /**
     * 优化
     *
     * @param nums
     * @param start
     * @param arr
     */
    public void huisu1(int nums, int start, int arr[]) {
        if (flag) return;
        if (nums == 13) {
            flag = true;
            return;
        }
        for (int i = start; i < arr.length; i++) {
            nums += arr[i];
            num++;
            huisu1(nums, i + 1, arr);
            if (flag) return;
            nums -= arr[i];
        }
    }

    //回溯转换为for循环使用
    public void huisu2(int nums,int start,int arr[]){
        for (int ii = 0; ii < arr.length; ii++) {
            for (int i = start; i < arr.length; i++) {
                nums += arr[i];
                num++;
//                huisu1(nums, i + 1, arr);
                if (flag) return;
                if (nums == 13) {
                    flag = true;
                    return;
                }
                nums -= arr[i];
            }
        }
    }
//
//    //回溯转换为for循环使用
//    public void huisu3(int nums,int start,int arr[]){
//        int cishu=0;
//
//        for (int i1 = 0; i1 < arr.length; i1++) {
//                nums = 0;
//            System.out.println(arr[i1]);
//                for (int i2 = i1; i2 < arr.length; i2++) {
//                    cishu++;
//                    nums+=arr[i2];
//                    System.out.print(arr[i2]+"==");
////                    if (nums == 13){
//////                        System.out.println(cishu);
////                        return;
////                    }
////                    nums-=arr[i2];
//                }
//                System.out.println();
//            }
//        }
//
////        for (int ii = 0; ii < arr.length; ii++) {
////            for (int i = start; i < arr.length; i++) {
////                nums += arr[i];
////                num++;
//////                huisu1(nums, i + 1, arr);
////                if (flag) return;
////                if (nums == 13) {
////                    flag = true;
////                    return;
////                }
////                nums -= arr[i];
////            }
////        }
//    }
//

}
