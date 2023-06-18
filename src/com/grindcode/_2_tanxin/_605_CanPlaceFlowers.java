package com.grindcode._2_tanxin;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/*
* 题目大意：
* 给定一个数组，表示种花的场地，0表示空的，1表示已经种上花了。
* 现在需要再种n朵花在这个场地里面，问是否可以满足。条件是花的左右相邻位置必须没有花
* */
public class _605_CanPlaceFlowers {
    //思路，就是判断前后两个是不是为0 如果是0就设置值  特殊处理第一个和最后一个
    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        if (flowerbed.length<=0){
            if (n > 0)
                return false;
            else
                return true;
        }
        if (flowerbed[0] == 0){
            n--;
            flowerbed[0] = 1;
        }
        for (int i = 2; i < flowerbed.length; i+=2) {
            if (i+1>=flowerbed.length){
                if (flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }else {
                if (flowerbed[i-1] == 0 && flowerbed[i] == 0&&flowerbed[i+1]==0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        if (n <= 0)return true;
        return false;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //只有一个值
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                if(n==1)return true;
            }
        }
        if (flowerbed.length>1){
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-1-1] == 0){
                flowerbed[flowerbed.length-1] = 1;
                n--;
            }
        }

        for (int i = 1; i < flowerbed.length-1; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i-1] ==0 && flowerbed[i+1]==0){
                    flowerbed[i] = 1;
                    n --;
                }
            }
        }
        if (n<=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1};
        _605_CanPlaceFlowers flowers = new _605_CanPlaceFlowers();
        System.out.println(flowers.canPlaceFlowers(arr, 2));
    }
}