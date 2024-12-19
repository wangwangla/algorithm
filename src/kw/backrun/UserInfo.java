package kw.backrun;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserInfo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setS(Consumer<String> stringConsumer) {
        stringConsumer.accept(name);
    }

    public String setSS(Supplier<String> stringSupplier) {
        return stringSupplier.get();
    }

    public void setSSS(Predicate<String> objectPredicate) {
        objectPredicate.test("xx");
    }
}
