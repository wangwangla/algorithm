package kw.shejimoshi.chapterOne.sample02.impl;

import kw.shejimoshi.chapterOne.sample02.interfa.Fly;

public class QuickFly implements Fly {
    @Override
    public void fly() {
        System.out.println("quick fly");
    }
}
