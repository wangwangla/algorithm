package com.java.math;

import java.util.Random;

public class MathUtils {

    static public Random random = new Random();
    static public int random (int start, int end) {
        return start + random.nextInt(end - start + 1);
    }

    public double area(float radis){
        return radis * radis * 3.141592;
    }

    public double area(double length,double width) {
        double ans=length*width;
        return ans;
    }

}
