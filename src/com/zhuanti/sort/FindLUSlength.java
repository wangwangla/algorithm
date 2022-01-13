package com.zhuanti.sort;

import java.util.HashMap;

/**
 * 找出里面独有的子序列
 */
public class FindLUSlength {
    public int findLUSlength(String[] strs) {
        HashMap< String, Integer > map = new HashMap < > ();
        for (String s: strs) {
            for (int i = 0; i < (1 << s.length()); i++) {
                String t = "";
                for (int j = 0; j < s.length(); j++) {
                    if (((i >> j) & 1) != 0)
                        t += s.charAt(j);
                }
                if (map.containsKey(t))
                    map.put(t, map.get(t) + 1);
                else
                    map.put(t, 1);
            }
        }
        int res = -1;
        for (String s: map.keySet()) {
            if (map.get(s) == 1)
                res = Math.max(res, s.length());
        }
        return res;
    }

    public static void main(String[] args) {
        String[] arr = {"aba", "cdc", "eae"};
        FindLUSlength luSlength = new FindLUSlength();
        luSlength.findLUSlength(arr);
    }
}
