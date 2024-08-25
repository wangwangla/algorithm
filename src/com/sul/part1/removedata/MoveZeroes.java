package com.sul.part1.removedata;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
//        int end = nums.length;
//        int start = 0;
//
//        while (start<end){
//            if(nums[start] == 0){
//                while (nums[end-1]==0){
//                    end--;
//                    if(start>=end)break;
//                }
//                if (start<end) {
//                    int num = nums[start];
//                    nums[start] = nums[end - 1];
//                    nums[end - 1] = num;
//                    end--;
//                }
//            }
//            start++;
//        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};
//        int arr[] = {0};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i+"  ");
        }
    }
}
