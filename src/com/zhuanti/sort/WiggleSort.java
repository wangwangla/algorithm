package com.zhuanti.sort;

import java.util.Arrays;

public class WiggleSort {
//    public void wiggleSort(int[] nums) {
//        Arrays.sort(nums);
//        int arr1[] = new int[nums.length/2];
//        int arr2[] = new int[nums.length - nums.length/2];
//        for (int i = 0; i < nums.length / 2; i++) {
//            arr1[i] = nums[i];
//        }
//        for (int i = nums.length/2; i < nums.length; i++) {
//            arr2[i-nums.length/2] = nums[i];
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            nums[2*i] = arr1[i];
//            nums[2*i+1] = arr2[i];
//        }
//    }

    public static void main(String[] args) {
        WiggleSort sort = new WiggleSort();
//        sort.wiggleSort(new int[]{1,1,2,1,2,2,1});
        sort.wiggleSort(new int[]{1,2,3,4,5,6,7});
    }

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int hal = nums.length / 2;
        boolean b = nums.length % 2 == 1;
        int xc = 0;
        if (b){
            xc = 1;
        }
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[hal+i + xc];
            nums[hal+i +xc] = temp;
        }
        System.out.println("-------------------------");
    }


    public void wiggleSort3(int[] nums) {
        if(nums.length == 0|| nums.length ==1)return;
        Arrays.sort(nums);
        int hal = nums.length / 2;
        boolean b = nums.length % 2 == 1;
        int xc = 0;
        if (b){
            xc = 1;
        }
        int index = 0;
        int xxx[] = new int[nums.length];
        for (int i = 0; i < nums.length/2; i++) {
            xxx[index++] = nums[i];
            xxx[index++] = nums[hal + i + xc];
        }
        if (b){
            xxx[index] = nums[nums.length / 2];
        }

        for (int i = 0; i < xxx.length; i++) {
            nums[i] = xxx[i];
        }
    }

}
