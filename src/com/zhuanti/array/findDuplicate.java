package com.zhuanti.array;

public class findDuplicate {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            end = end^nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            end = end ^ i;
        }
        return end;
    }


    public static void main(String[] args) {
        int arr[] = {1,3,2,2};
        findDuplicate findDuplicate = new findDuplicate();
        System.out.println(findDuplicate.findDuplicate(arr));
//        System.out.println("---------");
//        int count = 0;
//        for (int i : arr) {
//            count+=i;
//        }
//        for (int i1 : arr) {
//            count = count^i1;
//        }
//        System.out.println(count);

//        int a = 6;
//        int a1 = a ^ 3;
//        int a2 = a1 ^ 2;
//        int a3 = a2 ^ 1;
//        System.out.println("-------------");


    }

}
