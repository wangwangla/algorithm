package kw.shejimoshi.chapterOne.sample02.son;

import kw.shejimoshi.chapterOne.sample02.abs.Duck;
import kw.shejimoshi.chapterOne.sample02.impl.ClickBehave;

/**
 * 多用组合，少用继承
 */
public class RedDuck extends Duck {
    public RedDuck(){
        //行为使用一个类来实现，创建对象的时候，创建自己相应的类
//        如果感觉还是很麻烦，可以给它设置一个方法，进行传递参数、
        behave = new ClickBehave();
    }
}
