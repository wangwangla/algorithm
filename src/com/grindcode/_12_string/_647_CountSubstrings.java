package com.grindcode._12_string;

public class _647_CountSubstrings {
    public int countSubstrings(String str){
        int count=0;
        int[][] dp = new int[str.length()][str.length()];
        for (int i = 0; i < str.length(); i++) {
            dp[i][i] = 1;
            count++;
            System.out.println(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            for (int i1 = i+1; i1 < str.length(); i1++) {
                if(dp[i][i1]!=1){
                    if (isP(str,i,i1)){
                        System.out.println(str.substring(i,i1+1));
                        dp[i][i1] = 1;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean isP(String str, int i, int i1) {
        for (; i < i1; i++,i1--) {
            if (str.charAt(i)!=str.charAt(i1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "aaa";
        _647_CountSubstrings countSubstrings = new _647_CountSubstrings();
        System.out.println(countSubstrings.countSubstrings(str));
    }
}
