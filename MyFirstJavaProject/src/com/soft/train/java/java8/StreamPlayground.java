package com.soft.train.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.soft.train.java.patterns.common.Employee;

public class StreamPlayground {

    public static void main(final String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("str4");
        strList.add("str1");
        strList.add("str2");
        strList.add("str5");
        strList.add("str3");
        strList.add("str6");
        strList.stream()
               .sorted()
               .skip(2)
               .filter(s -> !s.endsWith("3"))
               .limit(2)
               .map(a -> {
                   Employee employeeLoc = new Employee();
                   employeeLoc.setName(a);
                   return employeeLoc;
               })
               .collect(Collectors.toList())
               .stream()
               .forEach(System.out::println);

    }
}
