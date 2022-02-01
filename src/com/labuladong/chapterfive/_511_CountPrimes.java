package com.labuladong.chapterfive;

import java.util.Arrays;

public class _511_CountPrimes {
    /**
     *
     * @param n
     * @return
     */
    public int countPrimes(int n){
       int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i))count ++;
        }
        return count;
    }

    boolean isPrime(int n){
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    int countPrimes2(int n){
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]){
                for (int i1 = 2 * i; i1 < n; i1+=i) {
                    isPrime[i1] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count ++;
        }
        return count;
    }


    int countPrimes3(int n){
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i < n; i++) {
            if (isPrime[i]){
                for (int i1 = i * i; i1 < n; i1+=i) {
                    isPrime[i1] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count ++;
        }
        return count;
    }
}
