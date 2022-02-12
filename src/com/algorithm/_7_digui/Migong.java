package com.algorithm._7_digui;

public class Migong {
    public static void main(String[] args) {

    }

    /**
     * == 2 ：可以走
     * == 0 ：没有走过
     * == 1 ：墙
     * == 3 ： 已经走过
     * @param arr
     * @param i
     * @param j
     */
    public void findWay(int arr[][],int i,int j){
        if (arr[i][j] == 2){
            System.out.println("=");
        }else {
            if (arr[i][j] == 0){
                arr[i][j] = 2;
//                shangxiazuoyu
//                否则  = 3；
//                if (findWay(arr,i+1,j)){
//
//                }
            }else {
                System.out.println("--");
            }
        }
    }
}
