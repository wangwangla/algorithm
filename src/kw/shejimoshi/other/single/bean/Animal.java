package kw.shejimoshi.other.single.bean;

public class Animal {
    private static Animal instance = new Animal();

    public static Animal getInstance() {
        return instance;
    }
}
