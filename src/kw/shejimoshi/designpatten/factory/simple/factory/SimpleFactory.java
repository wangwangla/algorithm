package kw.shejimoshi.designpatten.factory.simple.factory;

import kw.shejimoshi.designpatten.factory.simple.pazzia.NaiLaoPizza;
import kw.shejimoshi.designpatten.factory.simple.pazzia.Pazza;

/**
 * 这个工厂创建实例，并没有其他的东西
 */
public class SimpleFactory {
    public static Pazza getPizza(String name){
        Pazza pazza = null;
        if (name.equals("a")){
            pazza = new NaiLaoPizza();
        }else {
            pazza = null;
        }
        return pazza;
    }
}
