package kw.other.single.bean;

public class Cat {
    public volatile static Cat instance;

    public static Cat getInstance() {
        if (instance == null){
            synchronized (Object.class) {
                if (instance == null){
                    instance = new Cat();
                }
            }
        }
        return instance;
    }
}
