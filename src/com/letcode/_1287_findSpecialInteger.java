package com.letcode;

/**
 *
 */
public class _1287_findSpecialInteger {
    public int findSpecialInteger(int[] arr) {
        int i = arr.length / 4;
        for (int i1 = 0; i1 < arr.length - i; i1++) {
            if (arr[i1] == arr[i1 + i]){
                return arr[i1];
            }
        }
        return -1;
    }



    public void test(int num){
        int i = num / 4;
        for (int i1 = 0; i1 <= i; i1++) {
            System.out.println(i1*4);
        }
    }

    public static void main(String[] args) {
        _1287_findSpecialInteger integer = new _1287_findSpecialInteger();
        integer.test(8);
    }
}
