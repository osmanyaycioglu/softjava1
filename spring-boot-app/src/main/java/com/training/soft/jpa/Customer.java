package com.training.soft.jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "musteri")
@NamedQueries(value = {
                        @NamedQuery(name = "xyzQuery", query = "select c from Customer c where c.name=:deg1")
})
public class Customer {

    @Id
    @GeneratedValue
    private long         customerId;
    @Column(name = "isim", length = 30)
    @NotEmpty
    private String       name;
    @Column(name = "soyisim", length = 50)
    @Size(max = 50)
    private String       surname;
    @Max(120)
    @Min(18)
    @Column(name = "yas ")
    private int          age;

    @Embedded
    private ExtraData    extraData;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private Info         cinfo;

    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Phone>  phones;

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

    public Info getCinfo() {
        return this.cinfo;
    }

    public void setCinfo(final Info cinfoParam) {
        this.cinfo = cinfoParam;
    }

    public ExtraData getExtraData() {
        return this.extraData;
    }

    public void setExtraData(final ExtraData extraDataParam) {
        this.extraData = extraDataParam;
    }

    public CustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(final CustomerType customerTypeParam) {
        this.customerType = customerTypeParam;
    }

    public List<Phone> getPhones() {
        return this.phones;
    }

    public void setPhones(final List<Phone> phonesParam) {
        this.phones = phonesParam;
    }

}
