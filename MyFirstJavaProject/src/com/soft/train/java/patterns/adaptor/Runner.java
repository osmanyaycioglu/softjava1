package com.soft.train.java.patterns.adaptor;

import com.soft.train.java.patterns.common.Calisan;
import com.soft.train.java.patterns.common.Employee;
import com.soft.train.java.patterns.common.PrintSystem;

public class Runner {

    public static void main(final String[] args) {
        PrintSystem printSystemLoc = new PrintSystem();
        Employee employeeLoc = new Employee();
        employeeLoc.setName("osman");
        employeeLoc.setSurname("yay");

        Calisan calisanLoc = new Calisan();
        calisanLoc.setIsim("ali");
        calisanLoc.setSoyisim("veli");

        printSystemLoc.print(employeeLoc);
        printSystemLoc.print(new CalisanEmployeeAdaptor(calisanLoc));

    }
}
