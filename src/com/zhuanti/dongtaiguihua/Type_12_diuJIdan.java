package com.zhuanti.dongtaiguihua;

public class Type_12_diuJIdan {
    int res = 0;
    int N = 100;
    public int dropEgg(int eggNum,int hight){
        return res = Math.max(res,Math.max(
                dropEgg(eggNum,N - hight),
                dropEgg(eggNum-1,hight-1)))+1;
    }
}
