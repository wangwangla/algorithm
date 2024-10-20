package kw.annotation.classannotation;

import kw.annotation.utils.AnnotationInfo;

import java.lang.annotation.Annotation;

@RunnClassAnnotation("classtest")
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
        RunnClassAnnotation runnClassAnnotation = AnnotationInfo.checkClassAnnotation(this, RunnClassAnnotation.class);
        if (runnClassAnnotation != null) {
            System.out.println(runnClassAnnotation.value());
        }
    }
}
