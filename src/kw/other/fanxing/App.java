package kw.other.fanxing;

/**
 * 子类继承父类带有的
 * @param <T>
 */
public class App<T> extends BaseActor<Actor>{
    public static void main(String[] args) {
        App<Actor> app = new App<>();
        app.add(1);
    }
}
