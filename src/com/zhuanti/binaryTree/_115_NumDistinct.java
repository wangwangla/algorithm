package com.zhuanti.binaryTree;

/**
 * 输入：s = "rabbbit", t = "rabbit"
 * 输出：3
 * 解释：
 * 如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
 * rabbbit
 * rabbbit
 * rabbbit
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distinct-subsequences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _115_NumDistinct {
    public int numDistinct(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int dp[][] = new int[tLen+1][sLen+1];
        for (int i = 0; i < sLen; i++) {
            for (int i1 = 0; i1 < tLen; i1++) {
                if (i==0 && i1==0){
                    dp[i][i1] = 1;
                }else if (i==0){
                    dp[i][i1] = 1;
                }else if (i1==0){
                    dp[i][i1] = 1;
                }
                if (s.charAt(i-1) == t.charAt(i1-1)){
                    dp[i][i1] = dp[i-1][i1-1] + dp[i][i1-1];
                }else {
                    dp[i][i1] = dp[i][i1-1];
                }
            }
        }
        return dp[tLen][sLen];
    }
}
