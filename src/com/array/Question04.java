package com.array;

import java.util.*;
/**
 * @author:28188
 * @date: 2021/7/7
 * @time: 7:41
 *
 * 排列组合使用回溯比较好解决
 */
public class Question04 {
//    输入：nums = [1,2,3]
//    输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public List<List<Integer>> permute() {
//    输入：nums = [1,2,3]
        int nums[] = {1,2,3};
        List list = new ArrayList();
        int vv [] = new int[nums.length];
        huisu(nums,list,vv);
        return null;
    }

    public void huisu(int arr[],List list,int vv[]){
        if (list.size() == arr.length){
            System.out.println(Arrays.asList(list));
        }
        for (int i = 0; i < arr.length; i++) {
            if (vv[i] == 1)continue;
            vv[i] = 1;
            list.add(arr[i]);
            huisu(arr,list,vv);
            vv[i] = 0;
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Question04 question04 = new Question04();
        question04.permute();
    }
}
