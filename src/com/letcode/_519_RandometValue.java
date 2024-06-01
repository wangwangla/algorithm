package com.letcode;

import java.util.HashMap;
import java.util.Random;

/**
 * 没咋看明白
 */
public class _519_RandometValue {
    int m,n;
    int len;
    HashMap<Integer,Integer> deletedToExist;
    Random random = new Random();

    public _519_RandometValue(int m,int n){
        this.m = m;
        this.n = n;
        this.len = m * n;
        this.deletedToExist = new HashMap<>();
    }

    public int[] flip(){
        int rand = random.nextInt(len);
        int res = rand;
        if (deletedToExist.containsKey(rand)){
            res = deletedToExist.get(rand);
        }
        int last = len - 1;
        if (deletedToExist.containsKey(last)){
            last = deletedToExist.get(last);
        }

        deletedToExist.put(rand,last);
        len --;
        return new int[]{res/n,res%n};
    }

    public void reset(){
        this.len = this.m * this.n;
        this.deletedToExist.clear();
    }

}
