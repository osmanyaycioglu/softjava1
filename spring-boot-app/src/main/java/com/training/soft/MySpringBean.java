package com.training.soft;

import org.springframework.stereotype.Component;

@Component
public class MySpringBean {

    public void hello() {
        System.out.println("MySpringBean : hello world");
    }

}
