package kw.annotation.utils;

import java.lang.annotation.Annotation;

public class AnnotationInfo {
    public static <A extends Annotation> A checkClassAnnotation(Object object, Class clazz){
        if (object.getClass().isAnnotationPresent(clazz)) {
            return (A) object.getClass().getAnnotation(clazz);
        }
        return null;
    }
}
