package kw.shejimoshi.designpatten.factory.simple.order;

import kw.shejimoshi.designpatten.factory.simple.factory.SimpleFactory;
import kw.shejimoshi.designpatten.factory.simple.pazzia.Pazza;

import java.util.Scanner;

public class PazziaOrder {
    private String name;

    public PazziaOrder(){
        pazziaOrder();
    }

    public void pazziaOrder(){
//        String name = getType();
        Pazza pazza =null;

        name = getType();
        //工厂获取方法
        pazza = SimpleFactory.getPizza(name);//或者就是使用构造或者是使用一个注入
        pazza.prepar();
        pazza.bake();
        pazza.cut();
        pazza.box();

    }

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
