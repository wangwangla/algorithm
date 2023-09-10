package com.doul;

import java.util.ArrayList;

/**
 * 给你一个长度为n的数组，将其分成三个连续的区间，且每个区间的总和相等，问一共有多少种分法？
 */
public class _3_NumberOfWays {
    static long zz = 0;
    public static long numberOfWays(String s) {
//        StringBuilder nb = new StringBuilder();
//        nb.append(s.charAt(0));
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i)!=s.charAt(i-1)) {
//                nb.append(s.charAt(i));
//            }
//        }
//        String s1 = nb.toString();
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
        long base = zz;
        for (int i = start; i < s.length(); i++) {
            if (start>0){
                if (s.charAt(i)==s.charAt(i-1)){
                    zz += (zz - base);
                    continue;
                }
            }
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

    public static void main(String[] args) {
        System.out.println(numberOfWays("001101"));
    }

}
