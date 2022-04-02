package com.doul;

import java.util.ArrayList;

public class _3_NumberOfWays {

    static long zz = 0;
    public static long numberOfWays(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        xxx(arrayList,s,0);
        return zz;
    }



    public static void xxx(ArrayList<Character> arrayList,String s,int start){
        if (arrayList.size()>=3){
            if (arrayList.size()==3) {
                zz++;
                return;
            }
            return;
        }
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arrayList.size()>0) {
                if (arrayList.get(arrayList.size()-1) == c) {
                    continue;
                }
            }
            arrayList.add(c);
            xxx(arrayList,s,i+1);
            arrayList.remove(arrayList.size()-1);
        }
    }

}
