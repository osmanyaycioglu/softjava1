package com.training.soft.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private long     phoneId;
    private String   number;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer customer;

    public long getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(final long phoneIdParam) {
        this.phoneId = phoneIdParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerParam) {
        customer = customerParam;
    }


}
