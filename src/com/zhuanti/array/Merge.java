package com.zhuanti.array;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int xx = nums1.length;
        int p1 = m-1;
        int p2 = n-1;
        int cur = 0;

        int cc[] = new int[xx];
        int index= 1;
        while (p1>0||p2>0){
            if (p1 == 1) {
                cur = nums2[p1--];
            }else if (p2 == 1){
                cur = nums1[p2--];
            }else if (nums1[p1]>nums2[p2]){
                cur = nums1[p1--];
            }else {
                cur = nums2[p2--];
            }
            cc[m+n-index] = cur;
        }
        for (int i : cc) {
            System.out.println(i);
        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[nums1.length];
        int tempNum = 0;
        int num = nums1.length - 1;
        while (m>0&&n>0){
            if (nums1[m-1]>nums2[n-1]){
                tempNum = nums1[m-=1];
            }else {
                tempNum = nums2[n-=1];
            }
            temp[num--] = tempNum;
        }
        while (m>0){
            temp[num--] = nums1[m-=1];
        }
        while (n>0){
            temp[num--] = nums2[n-=1];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
            System.out.println(nums1[i]);
        }
    }




    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[nums1.length];
        int tempNum = 0;
        int num = nums1.length - 1;
        while (m>0&&n>0){
            if (nums1[m-1]>nums2[n-1]){
                tempNum = nums1[m-=1];
            }else {
                tempNum = nums2[n-=1];
            }
            nums1[num--] = tempNum;
        }
        while (m>0){
            nums1[num--] = nums1[m-=1];
        }
        while (n>0){
            nums1[num--] = nums2[n-=1];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;

        Merge merge = new Merge();
        merge.merge1(nums1,m,nums2,n);
    }
}
