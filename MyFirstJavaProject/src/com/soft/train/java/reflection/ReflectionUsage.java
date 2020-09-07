package com.soft.train.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.soft.train.java.annotation.AnnotationUsage;
import com.soft.train.java.annotation.MyAnno;

public class ReflectionUsage {

    public static void main(final String[] args) {
        Class<AnnotationUsage> clazzClassLoc = AnnotationUsage.class;
        Field[] declaredFieldsLoc = clazzClassLoc.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println("Field : " + fieldLoc.getName() + " type : " + fieldLoc.getType());
            MyAnno annotationLoc = fieldLoc.getAnnotation(MyAnno.class);
            if (annotationLoc != null) {
                System.out.println("MyAnno : al : "
                                   + annotationLoc.al()
                                   + " pattern : "
                                   + annotationLoc.pattern()
                                   + " value  : "
                                   + annotationLoc.value());
            }
        }
        Method[] declaredMethodsLoc = clazzClassLoc.getDeclaredMethods();
        for (Method methodLoc : declaredMethodsLoc) {
            System.out.println("Method : " + methodLoc.getName());
            Class<?> returnTypeLoc = methodLoc.getReturnType();
            Parameter[] parametersLoc = methodLoc.getParameters();
            for (Parameter paramLoc : parametersLoc) {
                System.out.println("Param name : " + paramLoc.getName() + " param type : " + paramLoc.getType());
            }
            MyAnno annotationLoc = methodLoc.getAnnotation(MyAnno.class);
            if (annotationLoc != null) {
                System.out.println("MyAnno : al : "
                                   + annotationLoc.al()
                                   + " pattern : "
                                   + annotationLoc.pattern()
                                   + " value  : "
                                   + annotationLoc.value());
            }
        }
        try {
            AnnotationUsage newInstanceLoc = clazzClassLoc.newInstance();
            Method methodLoc = clazzClassLoc.getMethod("take",
                                                       String.class,
                                                       Double.class);
            if (methodLoc != null) {
                Object invokeLoc = methodLoc.invoke(newInstanceLoc,
                                                    "xyz",
                                                    10D);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
