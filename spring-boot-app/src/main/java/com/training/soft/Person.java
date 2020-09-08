package com.training.soft;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    @NotEmpty(message = "İsim boş olamaz")
    @Size(max = 50, min = 2, message = "İsim 2 ile 50 arasında olmalı")
    private String name;
    @NotEmpty
    private String surname;
    @Max(120)
    @Min(18)
    private int    age;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }


}
