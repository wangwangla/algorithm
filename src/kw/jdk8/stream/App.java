package kw.jdk8.stream;

import kw.jdk8.lambda.MathUtils;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            arrayList.add((int) (a* Math.random()));
        }

        System.out.println(arrayList.stream().count());


//        arrayList.stream().map(
//                integer -> integer - 100
//        ).forEach(
//                System.out::println
//        );

//        arrayList.stream().filter(
//                it->it>0
//        ).sorted(new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o1 - o2;
//                    }
//                })
//                .forEach(
//                it->{
//                    System.out.println(it);
//                }
//        );
    }
}
