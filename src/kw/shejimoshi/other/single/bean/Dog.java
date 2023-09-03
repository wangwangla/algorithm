package kw.shejimoshi.other.single.bean;

public class Dog {
    public static Dog instance;

    public static synchronized Dog getInstance() {
        if (instance == null){
            return instance;
        }
        return instance;
    }

    public static Dog getInstance1() {
        if (instance == null){
            synchronized (Object.class) {
                if (instance == null){
                    instance = new Dog();
                }
            }
        }
        return instance;
    }
}
