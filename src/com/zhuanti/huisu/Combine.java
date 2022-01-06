package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int vv[] = new int[n];
        List<Integer> list = new ArrayList<>();
        xx(n,k,vv,list,0);
        return result;
    }

    public void xx(int n,int k,int[] vv,List<Integer> list,int start){
        if (list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i =start ; i <= n; i++) {
            if (vv[i-1] == 1)continue;
            vv[i-1] = 1;
            list.add(i);
            xx(n,k,vv,list,i+1);
            list.remove(list.size()-1);
            vv[i-1]=0;
        }
    }
}
