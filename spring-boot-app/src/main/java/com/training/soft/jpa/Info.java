package com.training.soft.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Info {

    @Id
    @GeneratedValue
    private long     infoId;
    private int      visitcount;
    private String   password;
    private String   username;

    @XmlTransient
    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer customer;

    public long getInfoId() {
        return this.infoId;
    }

    public void setInfoId(final long infoIdParam) {
        this.infoId = infoIdParam;
    }

    public int getVisitcount() {
        return this.visitcount;
    }

    public void setVisitcount(final int visitcountParam) {
        this.visitcount = visitcountParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


}
