package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * @author:28188
 * @date: 2021/7/6
 * @time: 7:53
 *
 * 题意
 * 给你一个数组，里面都是不带重复的正数，再给定 target，求出所有和为 target 的组合。
 * 元素可以重复使用，但组合不能重复，比如 [2, 2, 3] 与 [2, 3, 2] 是重复的。
 *
 * 思路在图里
 * ×：当前组合和之前生成的组合重复了。
 * △：当前求和 > target，不能选下去了，返回。
 * ○：求和正好 == target，加入解集，并返回。
 *
 * 作者：xiao_ben_zhu
 * 链接：https://leetcode-cn.com/problems/combination-sum/solution/shou-hua-tu-jie-zu-he-zong-he-combination-sum-by-x/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class HuiSu {
    public void combinationSum() {
        int arr[] = {2,3,5};
        Arrays.sort(arr);
        List list = new ArrayList();
        List<List<Integer>> lists = new ArrayList<>();
        huisuma2(arr,0,arr.length,8,list,lists);
        System.out.println(lists.size());
    }

    //没有重复值的
    private void huisuma(int can[], int start, int end, ArrayList arrayList){
        for (int i = start; i < end; i++) {
            arrayList.add(can[start]);
            System.out.println(Arrays.asList(arrayList));
            huisuma(can,i+1,end,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }

    //存在重复值的
    private void huisuma1(int can[], int start, int end, ArrayList arrayList){
        for (int i = start; i < end; i++) {
            if (arrayList.size() >= can.length)break;
            arrayList.add(can[start]);
            System.out.println(Arrays.asList(arrayList));
            huisuma1(can,i,end,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }


    private void huisuma2(int can[], int start, int end,int target, List arrayList,List nn){
        if (target == 0){
            System.out.println(Arrays.asList(arrayList)+"=====");
            nn.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < end; i++) {
            if (target - can[i]<0)break;
            arrayList.add(can[i]);
            huisuma2(can,i,end,target - can[i],arrayList,nn);
            System.out.println(Arrays.asList(arrayList));
            arrayList.remove(arrayList.size()-1);
        }
    }


    public static void main(String[] args) {
        HuiSu s = new HuiSu();
        s.combinationSum();
    }

    /**
     *
     * 回溯的套路：
     * 使用递归：
     * 1.遍历所有的数据，数据加进去
     * 3.进行递归
     * 2.数据取出来
     *
     *
     **/
}
