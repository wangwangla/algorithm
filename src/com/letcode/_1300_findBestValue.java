package com.letcode;

public class _1300_findBestValue {
    public int findBestValue(int[] arr, int target) {
        int xx = Integer.MAX_VALUE;
        int tt = target;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            tt = target;
            for (int i1 = 0; i1 < i; i1++) {
                tt -= arr[i1];
            }
            int i1 = tt / arr.length;
            int xxT = xx;
            xx = Math.min(xx,Math.abs(tt - i1 * arr.length));
            if (xxT != xx){
                res = i1;
            }
            System.out.println(i1+"--------"+xx);
        }
        return res;
    }
    public static void main(String[] args) {
        _1300_findBestValue value = new _1300_findBestValue();
        System.out.println(value.findBestValue(new int[]{4, 9, 3}, 10));
    }
}
