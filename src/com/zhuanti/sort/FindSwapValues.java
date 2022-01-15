package com.zhuanti.sort;

import java.util.HashMap;

public class FindSwapValues {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
            hashMap.put(array2[i],null);
        }
        if (Math.abs((sum1 - sum2) % 2) == 1) {
            return new int[]{};
        }
        int i = (sum1 - sum2) / 2;
        for (int i1 = 0; i1 < array1.length; i1++) {
//            System.out.println(array1[i1]);
            if (array1[i1] == 1){
                System.out.println();
            }
            if (hashMap.containsKey(array1[i1] - i)) {
//                System.out.println(array1[i1]+"-------------------"+(array1[i1]-i));
                return new int[]{array1[i1],array1[i1] - i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
//        int []array1 = {4, 1, 2, 1, 1, 2};
//        int []array2 = {3, 6, 3, 3};
//
        int []array1 = {1,2,3};
        int []array2 = {4,5,6};

        FindSwapValues values = new FindSwapValues();
        values.findSwapValues(array1,array2);
    }
}
