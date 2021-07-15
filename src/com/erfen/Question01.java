package com.erfen;

/**
 * 不仅仅是差值的二分搜索
 */
public class Question01 {
    public static void main(String[] args) {
        Question01 question01 = new Question01();
        int arr[] = {
                2,3,3,5,6
        };
        question01.findNum(arr,3);
    }

    /**
     * 找出有序数组的某个值
     *
     * 案例：
     * 输入不下降数组  找出某个值
     *
     */
    public void findNum(int arr[],int target){
        int start = 0;
        int end = arr.length;

        int num = 0;
        while (start<=end){
            num ++;
            int mid = (start + end)/2;
            if (arr[mid] == target){
                System.out.println(mid);
                break;
            }
            if (arr[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        System.out.println(num);
        System.out.println("over");
    }
}
