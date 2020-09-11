package com.soft.train.java.java8;

import java.util.Date;

import com.soft.train.java.patterns.common.Employee;

public class LambdaPlayground {

    public static void main(final String[] args) {

        int degisken = 103;
        Employee employeeLoc = new Employee();
        employeeLoc.setName("ali");

        // Normal
        MyInterfaceImpl implLoc = new MyInterfaceImpl();
        implLoc.execute("osman");

        // Anonim
        IMyInterface imi = new IMyInterface() {

            @Override
            public String execute(final String strParam) {

                return "Hello Anonim : " + strParam + " " + degisken + " " + employeeLoc.getName();
            }
        };
        imi.execute("osman");


        // Anonim 2
        IMyInterface imia1 = new IMyInterface() {

            @Override
            public String execute(final String strParam) {

                return "Hello Anonim : " + strParam;
            }
        };
        imia1.execute("osman");

        // Lambda
        IMyInterface imi2 = d -> {
            return "Hello lambda : " + d + " " + degisken + " " + employeeLoc.getName();
        };
        imi2.execute("osman");

        // Lambda 2
        IMyInterface imi3 = z -> "Hello lambda 2 : " + z + " " + employeeLoc.getName();
        imi3.execute("osman");

        // Lambda 3
        IMyInterface imi4 = a -> "Hello mello : " + a;
        imi4.execute("osman");

        IMyExecution ex = (a,
                           b,
                           c) -> "Hello mello : " + a + " count : " + b + " milis : " + c.getTime();
        ex.execute("osman",
                   5,
                   new Date());

    }
}

