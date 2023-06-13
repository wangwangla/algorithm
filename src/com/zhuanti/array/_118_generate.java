package com.zhuanti.array;

import java.util.ArrayList;
import java.util.List;

public class _118_generate {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int i1 = 0; i1 <= i; i1++) {
                if (i1==0||i1==i){
                    row.add(1);
                    System.out.print(1+"  ");
                }else {
                    row.add(ret.get(i-1).get(i1-1)+ret.get(i-1).get(i1));
                    System.out.print(ret.get(i-1).get(i1-1)+ret.get(i-1).get(i1)+"  ");
                }
            }
            System.out.println();
            ret.add(row);
        }
        return ret;
    }


    public static void main(String[] args) {
        _118_generate generate = new _118_generate();
        generate.generate(10);
    }
}
