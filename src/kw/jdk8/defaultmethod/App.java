package kw.jdk8.defaultmethod;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        DefaultInteface defaultInteface = ()->{
            System.out.println("xxxxxxxxxxxxxx");
        };
        defaultInteface.run();
        defaultInteface.test();
        defaultInteface.walk();

        Consumer<DefaultInteface> walk = DefaultInteface::walk;
        walk.accept(defaultInteface);

        Consumer<DefaultInteface> run = DefaultInteface::run;
        run.accept(defaultInteface);


        IConverter<String, Integer> converter04 = String::length; //
        converter04.convert("xxxx");
    }
}
