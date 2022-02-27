package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class test {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                c++;
            }
        }
        return c;
    }



    public static int minSteps1(String s, String t) {
        for (int i = 0; i < s.toCharArray().length; i++) {

        }
        return 0;
    }


    public static int minSteps(String s, String t) {
        int index=0;
        int index2 = 0;

        HashMap<Character,Integer> hashSet2 = new HashMap<>();
        HashMap<Character,Integer> hashSet = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashSet.put(c,hashSet.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            hashSet2.put(c,hashSet2.getOrDefault(c,0)+1);
        }

        for (Character character : hashSet.keySet()) {
            if (!hashSet2.containsKey(character)) {
                if (hashSet.get(character) == 0) {
                    hashSet.remove(character);
                }else {
                    hashSet.put(character,hashSet.get(character)-1);
                }
            }
        }
        for (Character character : hashSet2.keySet()) {
            if (!hashSet.containsKey(character)) {
                if (hashSet.get(character) == 0) {
                    hashSet2.remove(character);
                }else {
                    hashSet2.put(character,hashSet2.get(character)-1);
                }
            }
        }
        index = hashSet.size() - hashSet2.size();
        return 0;
    }
    public static long minimumTime(int[] time, int totalTrips) {
        int co=0;
        int x = 1;
        Arrays.sort(time);
        int index = 0;
        boolean flag = false;
        while (true) {
            if (!flag){
                x *=2;
            }else {
                x--;
            }
            co = 0;
            for (int i = 0; i < time.length; i++) {
                co+=x / time[i];
                if (totalTrips<=co){
                    if (totalTrips<co){
                        flag = true;
                    }else {
                        return x;
                    }
                }
            }
        }
    }


    public int minimumFinishTime(int[][] tires, int changeTime, int numLaps) {
        int dp[] = new int[numLaps];
        for (int i = 0; i < dp.length; i++) {
//            dp[i] = Math.min(dp[i]+tires[])
        }
        return 0;
    }

    public static void main(String[] args) {
        String s= "leetcode";
        String t  = "coats";
        minSteps(s,t);
        System.out.println(minimumTime(new int[]{10, 7, 4,2}, 7));
    }
}
