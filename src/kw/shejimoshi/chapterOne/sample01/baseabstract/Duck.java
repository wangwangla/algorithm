package kw.shejimoshi.chapterOne.sample01.baseabstract;

public abstract class Duck {
    protected void quack(){
        System.out.println("叫");
    }

    protected void swim(){
        System.out.println("游泳");
    }

    protected abstract void display();

//    ---------------------------
//    增加功能
//    但是有的不需要，并不是满足所有的，那么可以继承啥也不做。
//  最总的结果就是，子类慢慢的积累，然后写一大波啥也不做？？？
//    处理方法使用接口？

    public void fly(){
        System.out.println("fly duck");
    }

}
