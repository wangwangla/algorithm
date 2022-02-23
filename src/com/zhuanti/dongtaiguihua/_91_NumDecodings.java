package com.zhuanti.dongtaiguihua;

public class _91_NumDecodings {
     public void numDecodings(String s){
         int n = s.length();
         int[] f = new int[n + 1];
         f[0] = 1;
         for (int i = 1; i <= n; ++i) {
             if (s.charAt(i - 1) != '0') {
                 f[i] += f[i - 1];
             }
             if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                 f[i] += f[i - 2];
             }
         }
//         return f[n];
     }

    public static void main(String[] args) {
        String s = "12";
        _91_NumDecodings numDecodings = new _91_NumDecodings();
        numDecodings.numDecodings(s);
//        for (int i = 0; i < dp.length; i++) {
//            System.out.println(dp[i]);
//        }
    }
}
