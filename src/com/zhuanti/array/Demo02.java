package com.zhuanti.array;

public class Demo02 {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1<p2){
            while (nums[p1] == 0){
                p1++;
            }
            while (nums[p2] == 2){
                p2--;
            }
//            if (nums[])
        }


//        int zero = 0;
//        int one = 0;
//        int two = 0;
//        for (int num : nums) {
//            if (0 == num){
//                zero ++;
//            }else if (1 == num){
//                one++;
//            }else {
//                two++;
//            }
//        }
//        int xx = 0;
//        for (int i = 0; i < zero; i++) {
//            nums[xx++] = 0;
//        }
//        for (int i = 0; i < one; i++) {
//            nums[xx++] = 1;
//        }
//        for (int i = 0; i < two; i++) {
//            nums[xx++] = 2;
//        }
    }
}
