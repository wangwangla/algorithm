package com.shejimoshi.chapterOne.sample02.impl;

import com.shejimoshi.chapterOne.sample02.interfa.Fly;

public class SlowFly implements Fly {
    @Override
    public void fly() {
        System.out.println("fly slow");
    }
}
