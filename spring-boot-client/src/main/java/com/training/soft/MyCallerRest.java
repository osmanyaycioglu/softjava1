package com.training.soft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/call")
public class MyCallerRest {

    @GetMapping("/other")
    public String callOtherRestApp() {
        RestTemplate restTemplateLoc = new RestTemplate();
        String returnLoc = restTemplateLoc.getForObject("http://127.0.0.1:8080/first/hello/osman/yay",
                                                        String.class);

        return returnLoc;
    }

    @GetMapping("/person")
    public String callOtherRestAppPerson() {
        RestTemplate restTemplateLoc = new RestTemplate();
        Person personLoc = new Person();
        personLoc.setName("ali");
        personLoc.setSurname("veli");
        personLoc.setAge(30);
        String returnLoc = restTemplateLoc.postForObject("http://127.0.0.1:8080/first/hello4",
                                                         personLoc,
                                                         String.class);
        return returnLoc;
    }

}
