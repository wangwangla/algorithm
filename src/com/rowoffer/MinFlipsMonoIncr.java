package com.rowoffer;

public class MinFlipsMonoIncr {
    public int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        boolean isEnd = true;
        int endNum = 0;
        int startIndex = 0;
        int xx = 0;
        int yy = 0;
        for (char aChar : chars) {
            int i = aChar - '0';
            if (i == 0){
                startIndex ++;
            }else {
                break;
            }
        }
        for (int i = 0; i < chars.length - startIndex; i++) {
            int aChar = chars[chars.length - 1 - i] - '0';
            if (isEnd){
                if (aChar == 0) {
                    endNum ++;
                }else if (aChar == 1){
                    isEnd = false;
                }
            }else {
                if (aChar == 1){
                    xx ++;
                }else {
                    yy ++;
                }
            }
        }
        return endNum + Math.min(xx,yy);
    }
    public int minFlipsMonoIncr1(String s) {
        char[] chars = s.toCharArray();
        int startIndex = 0;
        int xx = 0;
        int yy = 0;
        for (char aChar : chars) {
            int i = aChar - '0';
            if (i == 0){
                startIndex ++;
            }else {
                break;
            }
        }
        for (int i = 0; i < chars.length - startIndex; i++) {
            int aChar = chars[chars.length - 1 - i] - '0';
            if (aChar == 1){
                xx ++;
            }else {
                yy ++;
            }
        }
        return Math.min(xx,yy);
    }

    public int minFlipsMonoIncr3(String s) {
        int dp[][]=new int[s.length()][2];
        //初始化
        dp[0][0]=s.charAt(0)=='0'?0:1;
        dp[0][1]=s.charAt(0)=='1'?0:1;
        //状态转移
        for (int i = 1; i <s.length() ; i++) {
            dp[i][0]=dp[i-1][0]+(s.charAt(i)=='0'?0:1);
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+(s.charAt(i)=='1'?0:1);
        }
        return Math.min(dp[s.length()-1][0],dp[s.length()-1][1]);
    }


    public static void main(String[] args) {
        String str = "0101100011";
        MinFlipsMonoIncr incr = new MinFlipsMonoIncr();
        incr.minFlipsMonoIncr1(str);
    }
}
