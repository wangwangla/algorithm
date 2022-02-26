package com.letcode;

import java.util.ArrayList;

public class _1313_DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            int num = nums[i];
            for (int i1 = 0; i1 < num; i1++) {
                arrayList.add(nums[2*i+1]);
            }
        }
        int size = arrayList.size();
        int ar[] = new int[size];
        for (int i = 0; i < arrayList.size(); i++) {
            ar[i] = arrayList.get(i);
        }
        return ar;
    }

    public int[] decompressRLElist1(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i+=2) {
            count+=nums[i];
        }
        int ar[] = new int[count];
        count = 0;
        for (int i = 0; i < nums.length; i+=2) {
            int num = nums[i];
            for (int i1 = 0; i1 < num; i1++) {
                ar[count++] = (nums[i+1]);
            }
        }
        return ar;
    }
}
