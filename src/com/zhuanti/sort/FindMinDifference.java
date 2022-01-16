package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinDifference {
    public int findMinDifference(List<String> t) {
        int aa[] = new int[t.size()];
        for (int i = 0; i < t.size(); i++) {
            String s = t.get(i);
            String[] split = s.split(":");
            aa[i] = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        }

        Arrays.sort(aa);
//        System.out.println(aa);

//        int dp[] = new int[aa.length-1];
//        int min = Integer.MAX_VALUE;
//        for (int i = 1; i < aa.length; i++) {
//            min = Math.min(min,aa[i] - aa[i-1]);
//        }
//        return min;
        int pre = aa[0];
        int ans = 0;
        for(int i = 1;i < aa.length;i++){
            ans = Math.min(ans,Math.min(aa[i]-pre,1440-aa[i]+pre));
            pre = aa[i];
        }
        return Math.min(ans,Math.min(aa[aa.length-1]-aa[0],1440-aa[aa.length-1]+aa[0]));

    }

    public static void main(String[] args) {
        String[] timePoints = {"00:00","23:59","00:00"};
        FindMinDifference difference = new FindMinDifference();
        ArrayList<String> strings = new ArrayList<String>();
        for (String timePoint : timePoints) {
            strings.add(timePoint);
        }
        difference.findMinDifference(strings);
    }
}
