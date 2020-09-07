package com.soft.train.java.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD,
          PARAMETER
})
public @interface MyAnno {

    String value() default "test";

    String pattern() default "osman";

    int al() default 20;
}
