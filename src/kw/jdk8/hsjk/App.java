package kw.jdk8.hsjk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        A<String, Integer> a = new A<>() {
            @Override
            public Integer apply(String a) {
                return a.length();
            }
        };

        A<String,Integer> aa = s->s.length();

        Function<Integer,Integer> f1 = i ->i+1;

        System.out.println(f1.apply(10));

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> consumer1 = it -> System.out.println(it);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.forEach(it->{
            System.out.println(it);
        });


        Supplier<Integer> supplier = ()->3;
        System.out.println(supplier.get());

        Predicate<String> stringPredicate = s-> s.length()>0;
        System.out.println(supplier);

    }

    public static Integer show(String s,Function<String,Integer> function){
        return function.apply(s);
    }
}
