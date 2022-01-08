package com.zhuanti;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2,6,4,1};
        App app = new App();
        app.xx(arr,6);
    }

    public void xx(int[]nums,int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[nums[i-1]]>0) {
                nums[nums[i-1]] = 0;
            }else{
                if (nums[i-1] != 0) {
                    list.add(nums[i - 1]);
                }
            }
        }
        System.out.println(list);
    }
}
