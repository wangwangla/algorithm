package com.zhuanti.paixu;

import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        //Long: 防止整型 int 溢出
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            //ceiling: 返回Set中大于/等于e的最小元素
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);

            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }

        return false;
    }

}
