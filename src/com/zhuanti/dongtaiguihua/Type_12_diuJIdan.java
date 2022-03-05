package com.zhuanti.dongtaiguihua;

public class Type_12_diuJIdan {
    int res = 0;
    int N = 100;
    public int dropEgg(int eggNum,int hight){
        if (eggNum<=0)return 9;
        return res = Math.max(res,Math.max(
                dropEgg(eggNum,N - hight),
                dropEgg(eggNum-1,hight-1)))+1;
    }

    public static void main(String[] args) {
        Type_12_diuJIdan d = new Type_12_diuJIdan();
        System.out.println(d.dropEgg(1, 10));
    }
}
