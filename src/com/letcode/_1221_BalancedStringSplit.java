package com.letcode;

/**
 * L 和  R相同的有几个
 */
public class _1221_BalancedStringSplit {
    public int balancedStringSplit(String s){
        int ans = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L'){
                count++;
            }else {
                count--;
            }
            if (count == 0){
                ans ++;
            }
        }
        return ans;
    }
}
