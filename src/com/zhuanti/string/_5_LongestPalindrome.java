package com.zhuanti.string;

public class _5_LongestPalindrome {
    //奇数的处理方法
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            //v为奇数   并且ans必须要为偶数   结论：只有一个是奇数
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _5_LongestPalindrome longestPalindrome = new _5_LongestPalindrome();
        longestPalindrome.longestPalindrome1("AAAA");
    }

    public int longestPalindrome1(String s) {
        int[] count = new int[57];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c-'A']++;
        }

        int xx = 0;
        for (int i : count) {
            xx += (i%2);
        }

        return xx == 0 ? s.length() : (s.length() - xx + 1);
    }

    public int longestPalindrome2(String str){
        int arr[] = new int[2];
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            finsArea(chars,arr,i);
        }
        return 0;
    }
    private static int finsArea(char[] str,int arr[],int mid){
        int minIndex = 0;
        int maxIndex = str.length-1;
        int hight = mid;
        int low = mid;
        int index = 0;

        //中间
        while (hight<=maxIndex){
            if (str[mid] != str[hight]){
                hight--;
                break;
            }
            hight++;
        }
        index = hight;
        while (low>=minIndex && hight<=maxIndex){
            if (str[low] == str[hight]){
                low--;
                hight ++;
            }else {
                break;
            }
        }

        if (hight - low > arr[1] - arr[0]){
            arr[0] = low;
            arr[1] = hight;
        }

        //右边
        return index;
    }

}
