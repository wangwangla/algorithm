package com.zhuanti.array;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int xx = nums1.length;
        int p1 = m-1;
        int p2 = n-1;
        int cur = 0;

        int cc[] = new int[xx];
        int index= 0;
        while (p1>=0||p2>=0){
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

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;

        Merge merge = new Merge();
        merge.merge(nums1,m,nums2,n);
    }
}
