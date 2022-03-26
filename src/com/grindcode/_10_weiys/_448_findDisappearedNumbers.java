package com.grindcode._10_weiys;

import java.util.ArrayList;
import java.util.List;

public class _448_findDisappearedNumbers {
    /**
     * 1到n，我的数组下标是0到n-1
     *
     * 将数值位置的数字变为负数
     * @param arr
     * @return
     */
    public List<Integer> findDisappearedNumbers(int arr[]){
        for (int i : arr) {
            //负数并不影响我们求值
            int x = Math.abs(i) - 1;
            if (arr[x]>0){
                arr[x] = -arr[x];
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}
