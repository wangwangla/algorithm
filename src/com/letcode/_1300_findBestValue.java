package com.letcode;

/**
 * 没做出来
 *
 * 给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，
 * 使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target 
 * （最接近表示两者之差的绝对值最小）。
 *
 * 如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
 *
 * 请注意，答案不一定是 arr 中的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-mutated-array-closest-to-target
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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

            int i1 = tt / (arr.length-i);

            int abs = Math.abs(tt - i1 * (arr.length - i));
            if (abs <= xx){

                xx = abs;
                res = i1;

            }

        }
        return res;
    }
    public static void main(String[] args) {
        _1300_findBestValue value = new _1300_findBestValue();
//        System.out.println(value.findBestValue(new int[]{4, 9, 3}, 10));
        System.out.println(value.findBestValue(new int[]{2,3,5}, 10));

    }
}
