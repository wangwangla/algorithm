package com.zhuanti.sort;

import java.util.Arrays;

public class _1985_KthLargestNumber {
    public String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums, ((o1, o2) -> {
            if (o1.length() > o2.length())
                return -1;
            else if (o1.length() < o2.length())
                return 1;
            else
                return o2.compareTo(o1);
        }));
        return String.valueOf(nums[k - 1]);
    }
}
