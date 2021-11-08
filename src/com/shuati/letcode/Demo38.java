package com.shuati.letcode;

/**
 * @author:28188
 * @date: 2021/3/22
 * @time: 23:13
 */
public class Demo38 {
    public static void main(String[] args) {
        int []a = new int[1];
        a[0] = 1;
        search(a,1);
        System.out.println("------------");
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                target++;
            }
        }
        return target;
    }

}
