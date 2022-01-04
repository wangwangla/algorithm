package com.zhuanti.array;

public class SortColors {
    public void sortColors(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//
//        }
        int num = nums.length;
        int start = 0;
        int end = num -1;
        while (true){
            while (nums[start]!=2){
                start++;
            }
            while (nums[end] == 0){
                end --;
            }
            if (start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        SortColors colors = new SortColors();
        colors.sortColors(new int[]{2,0,2,1,1});
    }
}
