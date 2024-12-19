package kw.backrun;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        UserInfo u = new UserInfo();
        System.out.println(u);
        u.setName("xx");
        u.setS(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        u.setS(
                s->{
                    System.out.println(s);
        });
        u.setSS(()->{
            return "xx";
        });

        u.setSSS(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>0;
            }
        });
    }
}
