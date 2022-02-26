package com.letcode;
/**
 * 给你⼀个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。请你将数组按
 * [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组
 */
public class _1470_ShuffleTheArray {
        public int[] shuffle(int nums [],int n){
//            for (int i = 1; i < nums.length-n; i*=2) {
//                int temp = nums[i];
//                nums[i] = nums[i+n];
//                nums[i+n] = temp;
//            }
//            return nums;
            int arr[] = new int[nums.length];
            int index = 0;
            for (int i = 0; i < n; i++) {
                arr[index++] = nums[i];
                arr[index++] = nums[i+n];
            }
            return arr;
        }

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        _1470_ShuffleTheArray shuffleTheArray = new _1470_ShuffleTheArray();
        int[] shuffle = shuffleTheArray.shuffle(arr, 2);
        for (int i = 0; i < shuffle.length; i++) {
            System.out.print(shuffle[i] +" ");
        }

    }
}
