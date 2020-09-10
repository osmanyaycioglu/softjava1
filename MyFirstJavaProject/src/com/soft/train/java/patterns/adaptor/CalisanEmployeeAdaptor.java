package com.soft.train.java.patterns.adaptor;

import com.soft.train.java.patterns.common.Calisan;
import com.soft.train.java.patterns.common.Employee;

public class CalisanEmployeeAdaptor extends Employee {

    private final Calisan calisan;

    public CalisanEmployeeAdaptor(final Calisan calisanParam) {
        super();
        this.calisan = calisanParam;
    }

    @Override
    public String getName() {
        return this.calisan.getIsim();
    }

    @Override
    public void setName(final String nameParam) {
        this.calisan.setIsim(nameParam);
    }

    @Override
    public String getSurname() {
        return this.calisan.getSoyisim();
    }

    @Override
    public void setSurname(final String surnameParam) {
        this.calisan.setSoyisim(surnameParam);
    }


}
