package com.training.soft;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SpringBootAppApplication implements ApplicationRunner {

    @Autowired
    private MySpringBeanInjection mySpringBeanInjection;

    @Scheduled(fixedDelay = 10_000)
    public void myScheduledMethod() {
        System.out.println();
    }

    public static void main(final String[] args) {
        SpringApplication.run(SpringBootAppApplication.class,
                              args);
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        MyThread myThreadLoc = new MyThread();
        myThreadLoc.start();

        this.mySpringBeanInjection.callHelloWorld();
        Future<String> myAsyncCallLoc = this.myAsyncCall();
        System.out.println("next line");
        String stringLoc = myAsyncCallLoc.get();
        System.out.println("Sonuç : " + stringLoc);
    }

    @Async
    public Future<String> myAsyncCall() {
        return new AsyncResult<String>("hello world !!!!");
    }

    @Async
    public Future<String> myAsyncCall2() {
        return new AsyncResult<String>("hello world !!!!");
    }

}
