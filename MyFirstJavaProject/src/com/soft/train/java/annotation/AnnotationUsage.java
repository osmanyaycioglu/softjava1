package com.soft.train.java.annotation;

@MyAnno
public class AnnotationUsage {

    @MyAnno(pattern = "osman")
    private final String name = "osman";
    @MyAnno("test1")
    private final int    age  = 50;


    public AnnotationUsage() {
    }

    @MyAnno(pattern = "ali", al = 8888)
    public void take(final String stringParam,
                     final Double amount) {
        String tempRef = stringParam;
        String concatLoc = tempRef.concat(" test");
        System.out.println(concatLoc);
    }

}
