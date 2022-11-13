package com.letcode;

public class _75_sortColors {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int i1 = 0; i1 < nums.length-1-i; i1++) {
                if (nums[i1]>nums[i1+1]){
                    int temp = nums[i1];
                    nums[i1] = nums[i1+1];
                    nums[i1+1] = temp;
                }
            }

            for (int num : nums) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int num : nums) {
            System.out.print(num);
        }
        return;
    }

    public void sortColors1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

        }
        return;
    }



    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        _75_sortColors colors = new _75_sortColors();
        colors.sortColors(arr);
    }
}
