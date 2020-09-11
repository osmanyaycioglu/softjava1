package com.soft.train.java.java8;

import java.util.ArrayList;
import java.util.List;

import com.soft.train.java.patterns.common.Employee;

public class LambdaPlayground2 {

    public static void main(final String[] args) {

        int degisken = 103;
        Employee employeeLoc = new Employee();
        employeeLoc.setName("ali");

        IMyBinding bindingLoc = g -> System.out.println(g);

        IMyBinding bindingLoc2 = System.out::println;

        IMyEmpty emptyLoc = () -> "osman";
        String xyzLoc = emptyLoc.xyz();
        System.out.println("Sonuç " + xyzLoc);

        MyLambdaUsage usageLoc = new MyLambdaUsage();
        usageLoc.useExecutionMethod((q,
                                     w,
                                     e) -> "name : " + q + " count : " + w + " date : " + e.getTime());

        usageLoc.abc(rt -> {
            System.out.println("---------");
            System.out.println(rt);
            System.out.println("----o----");
        });

        usageLoc.abc(System.out::println);


        List<String> strList = new ArrayList<>();
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        strList.add("str4");
        strList.add("str5");
        strList.add("str6");

        strList.forEach(e -> System.out.println(e));


    }
}

