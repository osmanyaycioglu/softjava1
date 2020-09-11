package com.training.soft;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpringBeanInjection {

    @Autowired
    private MySpringBean       msb;
    private final MySpringBean msb1;
    private MySpringBean       msb2;


    @Autowired
    public MySpringBeanInjection(final MySpringBean msb1) {
        this.msb1 = msb1;
    }

    @PostConstruct
    public void name() {

    }

    public void callHelloWorld() {
        this.msb.hello();
    }

    @Autowired
    public void wireMySpringBean(final MySpringBean msb2) {
        this.msb2 = msb2;
    }

}
