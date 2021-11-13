package com.chengxujingsai;

public class DongtaiGuiHua {
//    背包
//    wi  vi  重力不超过W,  总价值最大
    int n,W;
    int w[],v[];

    /**
     * 我的理解
     * 如果没有了,那就直接返回0
     * 如果单个重量太大 ,就不用,直接下一下
     * 否则,去下一个,当前的这个用  和   取下一个,当前这个使用
     * @param i : 取第几个
     * @param val:当前的重力
     * @return
     */
    public int sou(int i,int val){
        if (i == w.length-1)return 0;
        //如果单个的重力大 , 那就不能要
        if (val < w[i]){
            return sou(i+1,val);
        }else {
            //尝试一个可还是不可以取
            return Math.max(sou(i+1,val),sou(i+1,val - w[i]) + v[i]);
        }
    }

    /**
     * 使用数组记录
     * @param i
     * @param val
     */
    //如果存的有那么就直接使用
    public void sou2(int i,int val){

    }
}
