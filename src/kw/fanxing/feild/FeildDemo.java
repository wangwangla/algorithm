package kw.fanxing.feild;

import java.lang.reflect.Field;

public class FeildDemo {
    public static void main(String[] args) {
        FeildDemo demo = new FeildDemo();
        demo.test01(new People("ke",12));
    }

    public <T> void test01(T t){
        Field[] declaredFields = t.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        for (Field declaredField : declaredFields) {
            try {
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(t)+"  "+declaredField.getType());
                System.out.println(declaredField.get(t)+"  "+declaredField.getGenericType().getTypeName());

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
