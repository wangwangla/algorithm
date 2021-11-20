package com.shejimoshi.chapterOne.sample01;

import com.shejimoshi.chapterOne.sample01.baseabstract.Duck;
import com.shejimoshi.chapterOne.sample01.son.RedHeadDuck;

public class App {
    public static void main(String[] args) {
        RedHeadDuck duck = new RedHeadDuck();
        duck.display();
        Duck duck1 = new Duck() {
            @Override
            protected void display() {
                System.out.println("测试");
            }
        };

    }
}
