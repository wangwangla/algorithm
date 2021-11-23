package com.shejimoshi.chapterThree;

/**
 * 怎么理解装饰着呢？？
 * 我的理解就是把你给我，我给你装扮
 *
 * 比如File  FileInputStream  BufferedInputStream
 *
 */
public class App {
    public static void main(String[] args) {
        Water water = new Water();
        water.msg();
        Tang tang = new Tang();
        tang.setWater(water);
    }
}
