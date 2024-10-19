package kw.loader;


public class App {
    public static void main(String[] args) {
        ClassLoader classLoader = Object.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = App.class.getClassLoader();
        System.out.println(classLoader1);

        while (classLoader1!=null){
            classLoader1 = classLoader1.getParent();
            System.out.println(classLoader1);
        }

    }
}
