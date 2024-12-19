package kw.jdk8.defaultmethod;

public interface DefaultInteface {
    void run();

    default void test(){
        System.out.println("test 1");
    }

    default void walk(){
        System.out.println("walk");
    }


}
