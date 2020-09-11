package com.soft.train.java.java8;

import java.util.Date;

public class MyLambdaUsage {

    public void useExecutionMethod(final IMyExecution ex) {
        String executeLoc = ex.execute("osman",
                                       20,
                                       new Date());
        System.out.println(executeLoc);
    }

    public void abc(final IMyBinding ex) {
        ex.execute("ali");
    }
}
