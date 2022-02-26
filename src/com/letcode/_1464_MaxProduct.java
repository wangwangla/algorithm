package com.letcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _1464_MaxProduct {
    public int maxProduct(int arr[]){
        if (arr.length<2)return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                max = Math.max(max,(arr[i]-1)*(arr[i]-1));
            }
        }
        return max;
    }


    public int maxProduct1(int arr[]){
        if (arr.length<2)return 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        return (arr[arr.length-2]-1)*(arr[arr.length-1]-1);
    }

    public int maxProduct2(int nums[]){
        // if (arr.length<2)return 0;
        // int max = Integer.MIN_VALUE;
        // Arrays.sort(arr);
        // return (arr[arr.length-2]-1)*(arr[arr.length-1]-1);

        int len = nums.length;
        int max1 = 0, max2 = 0; //max1为最大值,max2为次大值
        for(int num: nums) {
            if(num > max1) {    //若num大于之前的最大值,则现在最大值是num,次大值是max1
                max2 = max1;
                max1 = num;
            }
            else if(num > max2) {
                max2 = num;
            }
        }
        return (max1-1) * (max2-1);
    }



    public static void main(String[] args) {
//        int arr[] = {1,5,4,5};
        int arr[] = {3,4,5,2};

        _1464_MaxProduct product = new _1464_MaxProduct();
        System.out.println(product.maxProduct(arr));
    }
}
