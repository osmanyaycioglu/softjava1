package com.training.soft.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class ExtraData {

    private String gender;
    private String xyz;

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String genderParam) {
        this.gender = genderParam;
    }

    public String getXyz() {
        return this.xyz;
    }

    public void setXyz(final String xyzParam) {
        this.xyz = xyzParam;
    }


}
