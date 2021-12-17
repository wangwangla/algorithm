package com.zhuanti.array;

public class Demo05 {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int count = arr1.length + arr2.length;
        int i = count % 2;
        int start = 0;
        int end = 0;
        int num1;
        int num2;
        if (i == 0){
            start = count/2;
            end = count/2;
        }else {
            start = count/2;
            end = start+1;
        }
        int index1 = 0;
        int index2 = 0;
        int countNum = 0;
        while (index1 < arr1.length && index2<arr2.length){
            if (arr1[index1]>arr2[index2]){
                countNum++;
                index2++;
                if (start==count){
                    num1 = arr1[index1];
                }
                if (end == count){
                    num2 = arr1[index1];
                    break;
                }
            }else if (arr1[index1]>arr2[index2]){
                countNum++;
                index1++;
                if (start==count){
                    num1 = arr2[index1];
                }
                if (end == count){
                    num2 = arr2[index1];
                    break;
                }
            }
//            else {
//                index1++;
//                index2++;
//                countNum++;
//                if (start==count){
//                    num1 = arr1[index1];
//                }
//                if (end == count){
//                    num2 = arr1[index1];
//                    break;
//                }
//                countNum++;
//                if (start==count){
//                    num1 = arr1[index1];
//                }
//                if (end == count){
//                    num2 = arr1[index1];
//                    break;
//                }
//            }

            //
        }

        return 0;
    }
}
