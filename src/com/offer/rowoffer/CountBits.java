package com.offer.rowoffer;

public class CountBits {

    public static void main(String[] args) {
        CountBits bits = new CountBits();
    }

    public int[] countBits(int n) {
        int bits[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            bits[i] = countOnes(i);
        }
        return null;
    }

    public int countOnes(int n){
        int ones = 0;
        while (n > 0){
            n &= (n - 1);
            ones ++;
        }
        return ones;
    }
}
