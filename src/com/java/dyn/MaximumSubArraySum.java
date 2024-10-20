package com.java.dyn;

public class MaximumSubArraySum {
    public void sum(int []num){
        int osum = num[0];
        int csum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (csum + num[i] < num[i]) {
                csum = num[i];
            }else {
                csum += num[i];
            }
        }
        if (osum>csum){
            System.out.println(osum);
            return;
        }
        System.out.println(csum);
    }
}
