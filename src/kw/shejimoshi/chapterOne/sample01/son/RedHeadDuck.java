package kw.shejimoshi.chapterOne.sample01.son;

import kw.shejimoshi.chapterOne.sample01.baseabstract.Duck;

public class RedHeadDuck extends Duck {
    //父类是保护类型，这里是保护类型或者是public
//    保护类型不能
    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}
