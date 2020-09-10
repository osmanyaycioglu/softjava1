package com.training.soft;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyFirstRest {


    @GetMapping("/hello/{xyz}/{abc}")
    public String hello(@PathVariable("xyz") final String name,
                        @PathVariable("abc") final String surname) {
        return "hello " + name + " " + surname;
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam("xyz") final String name,
                         @RequestParam("abc") final String surname) {
        return "hello2 " + name + " " + surname;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestHeader("xyz") final String name,
                         @RequestHeader("abc") final String surname) {
        return "hello3 " + name + " " + surname;
    }

    @PostMapping("/hello4")
    public String hello4(@RequestBody @Validated final Person person) {
        return "hello4 " + person.getName() + " " + person.getSurname() + " " + person.getAge();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleError(final Exception exceptionParam) {
        if (exceptionParam instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException exp = (MethodArgumentNotValidException) exceptionParam;
            List<ObjectError> allErrorsLoc = exp.getBindingResult()
                                                .getAllErrors();
            StringBuilder builderLoc = new StringBuilder(50);
            for (ObjectError objectErrorLoc : allErrorsLoc) {
                builderLoc.append("Validation Error : ");
                builderLoc.append(objectErrorLoc);
            }
            return builderLoc.toString();
        } else {
            return exceptionParam.getMessage();
        }
    }

}

