package com.training.soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpringBeanInjection {

    @Autowired
    private MySpringBean msb;

    public void callHelloWorld() {
        this.msb.hello();
    }

}
