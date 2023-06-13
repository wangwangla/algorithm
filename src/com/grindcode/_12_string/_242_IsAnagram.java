package com.grindcode._12_string;

/**
 * 含有相同的字符
 *
 */
public class _242_IsAnagram {
    public boolean isAnagram(String st1,String st2){
        if (st1.length()!=st2.length()){
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < st1.length(); i++) {
            char c = st1.charAt(i);
            arr[c-'a']++;
            char c1 = st2.charAt(i);
            arr[c-'a']--;
        }
        for (int i : arr) {
            if (i>0){
                return false;
            }
        }
        return true;
    }
}
