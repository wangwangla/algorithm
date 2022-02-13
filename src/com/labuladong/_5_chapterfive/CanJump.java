package com.labuladong._5_chapterfive;

public class CanJump {
    public boolean canJump(int []arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
            if (num<=i)return false;
        }
        return num>=arr.length-1;
    }
}
