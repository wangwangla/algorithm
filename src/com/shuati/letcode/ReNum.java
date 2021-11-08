package com.shuati.letcode;

/**
 * 题目：n个数字   数字都是0到n-1的， 求出其中的重复数字
 *
 */
public class ReNum {
    public static void main(String[] args) {
        ReNum num = new ReNum();
        int arr[] = new int[]{
                1,2,3,4,5,2
        };
        num.solution(arr);
    }
    //没有任何限制
    public void solution(int arr[]){
//        int tem = 0;
//        while (true){
//            if (arr[tem] == tem){
//                continue;
//            }else {
//                if (arr[arr[tem]] == arr[tem]) {
//                    break;
//                }else {
//                    tem = arr[tem];
//                }
//            }
//        }
        int aa []= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(aa [arr[i]] == arr[i]){
                if (arr[i] != i){
                    System.out.println(arr[i]);
                    break;
                }
            }else {
                aa [arr[i]] = arr[i];
            }
        }
    }

//    存在时间复杂限制
    public int duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return  nums[i];
                }
                swap(nums, i, nums[i]);
            }
            swap(nums, i, nums[i]);
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
