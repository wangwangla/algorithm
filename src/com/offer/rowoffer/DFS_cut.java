package com.offer.rowoffer;

import java.util.ArrayList;
import java.util.List;

public class DFS_cut {
    public void dfs_cut(int[] arr,int target){
        List<Integer> list = new ArrayList<>();
        dfs(arr,list,0,target,0);
    }

    public void dfs(int arr[],List<Integer> list,int pos,int target,int sum){
        if (sum > target){
            System.out.println("大于返回了");
        }
        if (sum == target){
            //记录   目标出现，处理一下
            System.out.println("success");
            return;
        }
        for (int i = pos; i < arr.length; i++) {
            list.add(arr[i]);
//            数字存在重复
//            数字重复    存在重复运算
            if (i>pos){
                if (arr[i] > arr[i-1]) {
                    return;
                }
            }
            dfs(arr,list,i+1,target,sum+arr[i]);
//            数字不存在重复
//            重复
//            dfs(arr,list,i,target,sum + arr[i]);
//            不重复
//            dfs(arr,list,i+1,target,sum + arr[i]);
            list.remove(Integer.valueOf(arr[i]));
        }
    }

    public static void main(String[] args) {
        DFS_cut dfsCut = new DFS_cut();
        dfsCut.dfs_cut(new int[]{1,2,3,4,5},100);
    }
}
