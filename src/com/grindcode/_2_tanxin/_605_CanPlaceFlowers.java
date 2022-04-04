package com.grindcode._2_tanxin;

public class _605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
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