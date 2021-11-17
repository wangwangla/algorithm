package com.zhuanti.erfenchazhao;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Mid01 {
    /**
     * 不可以处理上下边界
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int index = 0;
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end) / 2;
        if (nums.length == 0)return arr;
        if (target < nums[0])return arr;
        if (target > nums[end])return arr;
        while (start <= end){
            if (nums[mid] == target){
                arr[index] = mid;
                break;
            }
            if (nums[mid]>target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            mid = ( start + end ) / 2;
        }
        if (nums[mid] == target){
            int i = mid - 1;

            if (i>=0){
                if (nums[i] == target){
                    arr[1] = arr[0];
                    arr[0]=i;
                }else {
                    arr[1] = arr[0];
                }
            }
            int i1 = mid + 1;
            if (i1<nums.length){
                if (nums[i1] == target) {
                    arr[1] = i1;
                }else {
                    arr[1] = arr[0];
                }
            }
        }
//        if (nums[mid] == target){
//            arr[1] = mid;
//            if (mid>0){
//                int m = mid - 1;
//                if (nums[m] == target){
//                    arr[1] = arr[0];
//                    arr[0] = m;
//                }
//            }
//            if (mid < arr.length-1){
//                int m = mid + 1;
//                if (nums[m] == target){
//                    arr[1] = m;
//                }
//            }
//        }
        return arr;
    }

    /**
     * 整数数组 nums 按升序排列，数组中的值 互不相同 。
     *
     * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
     *
     * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     *
     *
     * 分为前后两断
     */
    public int search(int[] nums, int target) {
        if (nums[0] == target)return 0;
        if (nums[0]<target){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i]>target){
                    return -1;
                }
            }
        }else {
            for (int i =  nums.length - 1; i >=0; i--) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i]<target){
                    break;
                }
            }
        }
        return -1;
    }

    /**
     * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
     * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
     * 若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
     * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
     *
     * 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */
    public int findMin(int[] nums) {
        int min = nums[0];
        if (nums[0]>nums[nums.length-1]){
            min = nums[nums.length-1];
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i]>nums[i-1]){
                    min = nums[i-1];
                }
                if (nums[i]<nums[i-1]){
                    break;
                }
            }
        }else {
            min = nums[0];
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i+1]>nums[i]){
                    min = nums[i];
                    break;
                }
                if (nums[i+1]<nums[i]){
                    break;
                }
            }
        }
        return min;
    }


    public boolean findMin1(int[] nums,int target) {
        if (nums == null|| nums.length == 0)return false;
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (end >= start){
            mid = start + (mid - start) / 2;
            if (nums[mid] == target){
                return true;
            }
            if(nums[start] == nums[mid]){
                start++;
                continue;
            }
            if (nums[start] < nums[mid]){
                if (nums[start]>target && nums[mid]<target){
                    //在这一部分
                    end = mid-1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (nums[mid]<target && nums[end]>target){
                    start = mid + 1;
                }else {
                    end = end -1;
                }
            }

        }
        return false;
    }

    /**
     *
     * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,4,4,5,6,7] 在变化后可能得到：
     * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,4]
     * 若旋转 7 次，则可以得到 [0,1,4,4,5,6,7]
     * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
     *
     * 给你一个可能存在 重复 元素值的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     *
     *
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     *
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 38.4 MB
     * , 在所有 Java 提交中击败了
     * 9.29%
     * 的用户
     * 通过测试用例：
     * 193 / 193
     * @param nums
     * @return
     */
    public int findMin2(int[] nums) {
        int min = nums[0];
        if (nums[0]>=nums[nums.length-1]){
            min = nums[nums.length-1];
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i]>nums[i-1]){
                    min = nums[i-1];
                }
                if (nums[i]<nums[i-1]){
                    break;
                }
            }
        }else {
            min = nums[0];
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i+1]>nums[i]){
                    min = nums[i];
                    break;
                }
                if (nums[i+1]<nums[i]){
                    if(nums[i+1]<min){
                        min = nums[i+1];
                    }
                    break;
                }
            }
        }
        return min;
    }
    /**
     * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
     *
     * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     *
     * 没做好
     */
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int xx = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                xx ++;
            }else {
                max = Math.max(max,xx);
                xx = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int arr[] = {5,7,7,8,8,10};
        int arr[] = {10,9,2,5,3,7,101,18};
        Mid01 mid01 = new Mid01();
//        mid01.searchRange(arr,2);
//        System.out.println(mid01.findMin(arr));
        mid01.lengthOfLIS(arr);

        int arr1[] = {1,2,2,2,0,1,1};
        mid01.findMin2(arr1);
    }

}
