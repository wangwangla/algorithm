package kw.java.test;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        IntStream intStream = IntStream.range(0,1).asDoubleStream().mapToInt(i->{
            System.out.println(i);
            return 0;
        });

        intStream.sum();

    }
}
