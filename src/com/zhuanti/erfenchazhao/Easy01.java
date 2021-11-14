package com.zhuanti.erfenchazhao;

public class Easy01 {
    public static void main(String[] args) {
        int arr[] = {1,3};
        int target = 2;
        Easy01 easy01 = new Easy01();
        System.out.println(easy01.searchInsert(arr, target));
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-insert-position
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end) / 2;
        int inindex = nums.length;
        while (start<=end){
            if (nums[mid]>=target){
                inindex = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return inindex;
    }

    public int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return start;
    }

    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     *
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-search
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 39.1 MB
     * , 在所有 Java 提交中击败了
     * 91.58%
     * 的用户
     * 通过测试用例：
     * 47 / 47
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end) / 2;
        if (nums.length == 0)return -1;
        if (target < nums[0])return -1;
        if (target > nums[end])return -1;
        while (start <= end){
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid]>target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            mid = ( start + end ) / 2;
        }
        return -1;
    }

}
