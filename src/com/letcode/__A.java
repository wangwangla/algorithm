package com.letcode;

import java.util.ArrayList;

public class __A {
//    public int minBitFlips(int start, int goal) {
//
//        String s = Integer.toBinaryString(start);
//    }

//    public static void main(String[] args) {
//        // STOPSHIP: 2022/
//        int start = 10;
//        int goal = 7;
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//
//            int i1 = (start)&1;
//            start = start>>1;
//            int i2 =(goal)&1;
//            goal = goal>>1;
//            if (i1!=i2){
//                count ++;
//            }
//        }
//        System.out.println(count);
//
////        int aa = 10;
////        for (int i = 0; i < 32; i++) {
////            System.out.println(aa>>1);
////        }
//    }

    public int minBitFlips(int start, int goal) {
        int count = 0;
        for (int i = 0; i < 32; i++) {

            int i1 = (start)&1;
            start = start>>1;
            int i2 =(goal)&1;
            goal = goal>>1;
            if (i1!=i2){
                count ++;
            }
        }
        return count;
    }
    static int res = 0;



    public static int triangularSum(int[] nums) {
        sum(nums);
        return 0;
    }

    private static void sum(int[] nums) {
        if (nums.length==1)
        {
            res  = nums[0];
            return ;
        }
        int num1[] = new int[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            num1[i-1] = (nums[i]+nums[i-1])%10;
        }
        sum(num1);
    }
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

    public static long numberOfWays1(String s) {
//        ArrayList<Character> arrayList = new ArrayList<>();
//        xxx(arrayList,s,0);
        int dp[][] = new int[s.length()][s.length()];

        return zz;
    }

    public static void main(String[] args) {
//        triangularSum(new int[]{1,2,3,4,5});
//        System.out.println(numberOfWays("11100"));
        __A a = new __A();
        System.out.println(a.sumScores("babab"));
    }

    public long sumScores(String s) {
        int ss = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            builder.insert(0,c);
            ss+=score(builder,s);
        }
        return ss;
    }

    public int score(StringBuilder builder,String src){
        int x  =0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == src.charAt(i)) {
                x++;
            }else {
                break;
            }
        }
        return x;
    }
}
