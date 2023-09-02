package kw.java.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<People> arrayList = new ArrayList();
        arrayList.add(new People(1,"11"));
        arrayList.add(new People(2,"22"));
        arrayList.add(new People(3,"33"));
        arrayList.add(new People(4,"44"));
//        IntStream intStream = IntStream.range(0,1).asDoubleStream().mapToInt(i->{
//            return 0;
//        });

//        intStream.sum();

//        arrayList.forEach(item->{
//            System.out.println(item+"--");
//        });

//        arrayList.forEach(item->{
//            System.out.println(item+"--");
//        });

        People people[] = new People[arrayList.size()];
        People[] array =  arrayList.toArray(people);

        arrayList.forEach(item->{
            System.out.println(item+"--");
        });

        array[0].setName("xxx");

        arrayList.forEach(item->{
            System.out.println(item+"--");
        });


        Iterator<People> iterator = arrayList.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
            iterator.remove();
        }

    }

}
