package com.training.soft;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

    @Bean
    public ExecutorService name() {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);
        return newFixedThreadPoolLoc;
    }

}
