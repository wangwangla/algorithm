package com.offer.rowoffer;

import java.util.HashMap;

/**
 * 前缀和为0  为啥开始要放个-1
 */
public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);//用来处理特殊情况的
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1:1;
            //两个数字相同的时候，表示这一部分存在相同数目
            if (map.containsKey(sum)){
                maxLength = Math.max(maxLength,i - map.get(sum));
            }else {
                map.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        FindMaxLength length = new FindMaxLength();
        int arr[] = {
                0,1,0,1,0
        };
        length.findMaxLength(arr);
    }
}
