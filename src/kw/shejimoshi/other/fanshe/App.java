package kw.shejimoshi.other.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        InstanceDemo demo = new InstanceDemo();
        System.out.println(demo.getClass());
        Class aClass1 = demo.getClass();
        System.out.println(demo);
        try {
            Object o = aClass1.newInstance();
            System.out.println(o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------");

//        InstanceDemo demo = new InstanceDemo();
//        System.out.println(demo);

        try {
            Class<?> aClass = Class.forName("kw.shejimoshi.other.fanshe.InstanceDemo");
            Constructor<?>[] constructors = aClass.getConstructors();
//            for (Constructor<?> constructor : constructors) {
//                constructor
//            }
            Constructor<?> constructor = constructors[0];
            Object o1 = constructor.newInstance(1);
            System.out.println(o1);
            /**
             * 有参数和无参数构造
             * - 有参数： 使用class直接创建
             * - 无参树： 找到构造函数，进行创建
             */

            Field[] declaredFields = aClass.getDeclaredFields();
            Method setAge = aClass.getMethod("setAge", int.class);
            setAge.setAccessible(true);
            setAge.invoke(aClass,1);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
