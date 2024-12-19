package kw.jdk11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class jdk11learn {
    public static void main(String[] args) {
        var name = "chen";
        System.out.println(name);
        var age = 10;

        List<Integer> list = Arrays.asList(1, 2, 3, 5);
        list.forEach((it)->{
            System.out.println(it);
        });
        list.forEach(System.out::println);
    }
}
