package com.soft.train.java.config.reflection;

import java.lang.reflect.Field;

public class ValidationEngine {


    public void process(final Object objectParam) {
        try {
            Class<?> classLoc = objectParam.getClass();
            Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                ValidateString validateAnnotationLoc = fieldLoc.getAnnotation(ValidateString.class);
                if (validateAnnotationLoc != null) {
                    if (fieldLoc.getType() == String.class) {
                        fieldLoc.setAccessible(true);
                        String stringLoc = (String) fieldLoc.get(objectParam);
                        String startLoc = validateAnnotationLoc.start();
                        if (!stringLoc.startsWith(startLoc)) {
                            throw new IllegalArgumentException("String : "
                                                               + stringLoc
                                                               + " "
                                                               + startLoc
                                                               + " la başlamıyor");
                        }
                    }
                }
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
