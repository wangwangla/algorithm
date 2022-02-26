package com.letcode;

import java.util.ArrayList;

public class _1389_CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] res = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            arrayList.add(index[i],nums[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
