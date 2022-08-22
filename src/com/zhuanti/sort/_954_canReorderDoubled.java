package com.zhuanti.sort;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定一个长度为偶数的整数数组 arr，只有对 arr 进行重组后可以满足 “对于每个 0 <= i < len(arr) / 2，
 * 都有 arr[2 * i + 1] = 2 * arr[2 * i]” 时，返回 true；否则，返回 false。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/array-of-doubled-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _954_canReorderDoubled {
    public boolean canReorderDoubled(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        Arrays.sort(arr);
        for (int i : arr) {
            hashSet.remove(i);

            int i2 = i * 2;
            if (hashSet.contains(i2)){
                hashSet.remove(i2);
            }else {
                return false;
            }
        }
        if (hashSet.size()==0)return true;
        return false;
    }

    public static void main(String[] args) {
        _954_canReorderDoubled canReorderDoubled = new _954_canReorderDoubled();
        canReorderDoubled.canReorderDoubled(new int[]{3,1,3,6});
    }
}
