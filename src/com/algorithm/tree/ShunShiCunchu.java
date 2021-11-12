package com.algorithm.tree;

public class ShunShiCunchu<T> {
    private int arr[];
    public ShunShiCunchu(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int arr[] = {
                1,2,3,4,5,6,7
        };
        ShunShiCunchu shunShiCunchu = new ShunShiCunchu(arr);
    }

    public void preOrder(){
        this.preOrder(0);
    }

    public void preOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("-----------");
        }
        System.out.println(arr[index]);
        if ((index * 2 + 1)<arr.length){
            preOrder(2*index + 1);
        }
        if ((index * 2 + 2) < arr.length){
            preOrder(2*index+2);
        }
    }
    public void middleOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("-----------");
        }
        if ((index * 2 + 1)<arr.length){
            middleOrder(2*index + 1);
        }
        System.out.println(arr[index]);
        if ((index * 2 + 2) < arr.length){
            middleOrder(2*index+2);
        }
    }

    public void houOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("-----------");
        }
        if ((index * 2 + 1)<arr.length){
            houOrder(2*index + 1);
        }
        System.out.println(arr[index]);
        if ((index * 2 + 2) < arr.length){
            houOrder(2*index+2);
        }
    }

}

