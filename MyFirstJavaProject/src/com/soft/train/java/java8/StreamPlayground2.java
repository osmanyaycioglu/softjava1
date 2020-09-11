package com.soft.train.java.java8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.soft.train.java.patterns.common.Employee;

public class StreamPlayground2 {

    public static void main(final String[] args) {
        try {
            int sumLoc = Files.readAllLines(Paths.get(".",
                                                      "employees.txt"),
                                            Charset.defaultCharset())
                              .stream()
                              .map(r -> {
                                  Employee employeeLoc = new Employee();
                                  String[] splitLoc = r.split(",");
                                  employeeLoc.setName(splitLoc[0]);
                                  employeeLoc.setSurname(splitLoc[1]);
                                  return employeeLoc;
                              })
                              .peek(System.out::println)
                              .sorted()
                              .filter(t -> t.getName()
                                            .equals("ali"))
                              .distinct()
                              .mapToInt(e -> e.getName()
                                              .length())
                              .sum();
            System.out.println("sum " + sumLoc);
            // .forEach(System.out::println);

            Stream.of("1",
                      "2",
                      "3",
                      "7",
                      "1")
                  .sorted()
                  .distinct()
                  .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
