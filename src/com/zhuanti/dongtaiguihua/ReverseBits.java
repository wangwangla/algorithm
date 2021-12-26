package com.zhuanti.dongtaiguihua;

public class ReverseBits {
    public int reverseBits(int num) {

        for (int i = 0; i < num; i++) {

        }
        return 0;
    }


    public static void main(String[] args) {

    }

    /**
     * 某位是1 ，那么就加1 ，如果为0，那么就改变这一个，计算出新的长度
     * @param num
     * @return
     */
    public int reverseBits1(int num) {
        int cur = 0;
        int insert = 0;
        int res = 1;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                cur += 1;
                insert += 1;
            } else {
                insert = cur + 1;
                cur = 0;
            }
            res = Math.max(res, insert);
        }
        return res;
    }
}
