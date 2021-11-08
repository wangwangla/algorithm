package com.algorithm.chazhao;

public class ChazhiFind {
    public static int insertValueSearch(int[] arr, int start, int end, int findValue) {
        System.out.println("插值查找被调用了！");
        if (start > end || findValue < arr[0] || findValue > arr[arr.length - 1]) {
            return -1;
        }

        // 动态获取中值及其下标
        int mid = start + (end - start) * (findValue - arr[start]) / (arr[end] - arr[start]);
        int midValue = arr[mid];

        // 比较中值：右递归的情况
        if (findValue > midValue) {
            return insertValueSearch(arr, mid + 1, end, findValue);
            // 比较中值：左递归的情况
        } else if (findValue < midValue) {
            return insertValueSearch(arr, start, mid - 1, findValue);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int arr[] = {
                1,3,5,7,10,13,18
        };
        insertValueSearch(arr,0,arr.length-1,3);
    }
}
