package kw.annotation.classannotation;

import kw.annotation.utils.AnnotationInfo;

import java.lang.annotation.Annotation;

@ClassAnnotation("classtest")
public class App {
    public static void main(String[] args) {
        NumberAnnotation numberAnnotation = new NumberAnnotation();
        for (Annotation annotation : numberAnnotation.getClass().getAnnotations()) {
            System.out.println(annotation);
        }

        App app = new App();
        app.test();
    }

    public void test(){
        ClassAnnotation classAnnotation = AnnotationInfo.checkClassAnnotation(this, ClassAnnotation.class);
        if (classAnnotation != null) {
            System.out.println(classAnnotation.value());
        }
    }
}
