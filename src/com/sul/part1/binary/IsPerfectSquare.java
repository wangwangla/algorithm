package com.sul.part1.binary;

public class IsPerfectSquare {
    public static void main(String[] args) {
        IsPerfectSquare perfectSquare =  new IsPerfectSquare();
        System.out.println(perfectSquare.isPerfectSquare(4));
    }
    public boolean isPerfectSquare(int num) {
        int i = num / 2;
        int start = 1;
        int end = i;
        while (start<=end){
            int mid = start + (end - start) / 2;
            long i1 = (long)mid * mid;
            if (i1 <num){
                start = mid+1;
            }else if (i1 > num){
                end = mid-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
