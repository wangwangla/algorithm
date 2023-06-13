package com.grindcode._10_weiys;

/**
 * 数组  1-n
 * 最多可以分多少组，使得排列后的顺序不变
 *
 *
 * 从左往右遍历，同时记录当前的最大值，每当当前最大值等于数组位置时，我们可以多一次
 * 分割。
 * 为什么可以通过这个算法解决问题呢？如果当前最大值大于数组位置，则说明右边一定有小
 * 于数组位置的数字，需要把它也加入待排序的子数组；又因为数组只包含不重复的 0 到 n，所以
 * 当前最大值一定不会小于数组位置。所以每当当前最大值等于数组位置时，假设为 p，我们可以
 * 成功完成一次分割，并且其与上一次分割位置 q 之间的值一定是 q + 1 到 p 的所有数字
 *
 */
public class _769_maxChunksToSorted {
    public int maxChunksToSorted(int arr[]){
        int chunks = 0;
        int curMax = 0;
        for (int i = 0; i < arr.length; i++) {
            curMax = Math.max(curMax,arr[i]);
            if (curMax == i){
                ++chunks;
            }
        }
        return chunks;
    }
}
