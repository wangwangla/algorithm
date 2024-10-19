package kw.annotation.feildannatation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class App {
    @FeildTestAnnotation
    private int age;
    public static void main(String[] args) {
        App app = new App();
        for (Field field : app.getClass().getDeclaredFields()) {
            System.out.println(field);
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                System.out.println(annotation);
            }
        }
    }
}
