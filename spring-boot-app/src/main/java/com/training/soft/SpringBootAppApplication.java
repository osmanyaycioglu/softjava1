package com.training.soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication implements ApplicationRunner {

    @Autowired
    private MySpringBeanInjection mySpringBeanInjection;

    public static void main(final String[] args) {
        SpringApplication.run(SpringBootAppApplication.class,
                              args);
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.mySpringBeanInjection.callHelloWorld();
    }

}
