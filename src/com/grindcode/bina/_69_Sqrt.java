package com.grindcode.bina;

public class _69_Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }

    public static int sqrt(int n){
        int left = 0;
        int right = n;
        while (left<=right){
            int mid = (left + right) >> 1;
            int mid1 = mid * mid;
            if (mid1>n){
                right = mid - 1;
            }else if (mid1<n){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return right;
    }
}
