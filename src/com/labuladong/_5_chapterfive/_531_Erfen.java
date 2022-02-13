package com.labuladong._5_chapterfive;

public class _531_Erfen {
    public int erfen(int a[],int target){
        int max = 0;
        int count = 0;
        for (int i : a) {
            if(max<i){
                max=i;
            }
        }
        for (int i = 1; i < max; i++) {
            count++;
            int c = 0;
            for (int i1 : a) {
                c += (int)Math.ceil(i1*1.0F / i);
            }

            if (c==target){
                System.out.println(i);
            }
        }
        System.out.println(count);
        return 0;
    }

    public int erfen1(int a[],int target){
        int max = 0;
        for (int i : a) {
            if(max<i){
                max=i;
            }
        }
        int count = 0;
        int left = 0;
        int right = max;
        while (left<=right){
            count++;
            int sp = (left+right)>>1;
            int c = 0;
            for (int i1 : a) {
                c += (int)Math.ceil(i1*1.0F / sp);
            }
            if (c>target){
                left = sp+1;
            }else if (c<target){
                left = sp-1;
            }else {
                System.out.println(sp);
                if (sp==0)return sp;
                right = sp-1;
            }
        }
        System.out.println("----"+count);
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        _531_Erfen erfen = new _531_Erfen();
        erfen.erfen1(arr,8);
    }
}
