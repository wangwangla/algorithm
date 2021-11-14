package com.zhuanti.erfenchazhao;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo01 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        boolean isOne = true;
        if (total % 2 == 0){
            isOne = false;
        }else {
            isOne = true;
        }
        int target = total / 2;
        int max = Math.min(nums1.length,nums2.length);
        int num1Index = 0;
        int num2Index = 0;
        int xx = 0;
        for (int i = 0; i < max; i++) {
            if (nums1[num1Index]>nums2[num2Index]){
                xx ++;
                num2Index++;
            }else {
                xx ++;
                num1Index ++;
            }
            if (target == xx){
                System.out.println(nums1[num1Index]);
                break;
            }
        }
        if (xx < target) {
            if (num1Index < nums1.length) {

            } else {

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int arr1[] = {1,2,4,5,6};
        int arr2[] = {2,4,5};
        demo01.findMedianSortedArrays(arr1,arr2);
    }
}
