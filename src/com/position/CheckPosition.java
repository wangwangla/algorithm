package com.position;

/**
 * 1    2   3   4   5   6
 * 7    8   9   10  11  12
 * 13   14  15  16  17  18
 * 19   20  21  22  23  24
 * 25   26  27  28  29  30
 * 31   32  33  34  35  36
 *
 */
public class CheckPosition {
    public void checkNear(int allNumer,int current){
//        int hang = current / allNumer;
//        int lie = current % allNumer;
//
        int arr[] = new int[]{
                -1,1,allNumer,-allNumer
        };
//        int i = current - 1;
//        int i1 = current + 1;
//        int i2 = current + allNumer;
//        int i3 = current - allNumer;
        for (int i : arr) {
            int i1 = allNumer + i;

        }
    }
}
