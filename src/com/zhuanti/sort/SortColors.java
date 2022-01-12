package com.zhuanti.sort;

public class SortColors {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >0; j--) {
                if (nums[j]<nums[j-1]){
                    System.out.println(nums[j]+"-----"+nums[j-1]);
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        SortColors colors = new SortColors();
        colors.sortColors(arr);
    }
}
