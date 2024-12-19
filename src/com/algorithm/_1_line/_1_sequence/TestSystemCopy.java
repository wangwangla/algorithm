package com.algorithm._1_line._1_sequence;

public class TestSystemCopy {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int a = 0; a < 4; a++) {
            arr[a] = 4;
        }

        System.arraycopy(arr,0,arr,6,4);

        printAll(arr);
    }

    private static void printAll(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"  ==========  "+i);
        }
    }
}
