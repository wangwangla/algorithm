package kw.annotation.methodannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();
        Method[] methods = methodTest.getClass().getMethods();
        for (Method method : methods) {
            for (Annotation declaredAnnotation : method.getDeclaredAnnotations()) {
                System.out.println(declaredAnnotation);
            }
        }
    }
}
