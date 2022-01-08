package com.zhuanti.erfenchazhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * 350
 *
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i : nums1) {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        for (int i : nums2) {
            if (hashMap.containsKey(i)) {
                Integer orDefault = hashMap.get(i);
                orDefault--;
                list.add(i);
                if (orDefault>0){
                    hashMap.put(i,orDefault);
                }else {
                    hashMap.remove(i);
                }
            }
        }
        int index = 0;
        int num[] = new int[list.size()];
        for (Integer integer : list) {
            num[index++] = integer;
        }
        return num;
    }

    public static void main(String[] args) {
        int arr1[] = {4,9,5};
        int arr[] = {9,4,9,8,4};
        Intersect intersect = new Intersect();
        intersect.intersect(arr,arr1);
    }
}
