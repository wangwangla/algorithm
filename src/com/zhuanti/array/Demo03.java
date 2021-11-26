package com.zhuanti.array;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * 把后半部分作为一个存储地方，遍历两个数组，将数据移动这个一部分
     *
     * 没写好
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
//        int num3[] = new int[m+n];
        int xx = nums1.length;
        int p1 = m-1;
        int p2 = n-1;
        int cur = 0;
        while (p1>0||p2>0){
            if (p1 <0) {
                cur = nums2[p2--];
            }else if (p2 <0){
                cur = nums1[p1--];
            }else if (nums1[p1]>nums2[p2]){
                cur = nums1[p2--];
            }else {
                cur = nums2[p1--];
            }
            nums1[xx - (p1+p2-1)-1] = cur;
        }
    }


    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int num3[] = new int[m+n];
        int p1 = 0;
        int p2 = 0;
        int cur = 0;
        while (p1<m||p2<n){
            if (p1 == m) {
                cur = nums2[p2++];
            }else if (p2 == n){
                cur = nums1[p1++];
            }else if (nums1[p1]>nums2[p2]){
                cur = nums2[p2++];
            }else {
                cur = nums1[p1++];
            }
            num3[p1+p2-1] = cur;
        }
        for (int i = 0; i < num3.length; i++) {
            nums1[i] = num3[i];
        }
    }
}
