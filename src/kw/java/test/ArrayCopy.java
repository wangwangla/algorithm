package kw.java.test;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4};
        Integer[] ints = Arrays.copyOf(arr, arr.length);
        for (int anInt : ints) {
            System.out.print (anInt+" ");
        }
        System.out.println("---------------");

        Integer []temp = new Integer[arr.length+3];
        System.arraycopy(arr, 0,temp,0,arr.length);
        for (int anInt : temp) {
            System.out.print (anInt+" ");
        }
        temp[arr.length] = null;
        System.out.println("---------------");


    }
}
