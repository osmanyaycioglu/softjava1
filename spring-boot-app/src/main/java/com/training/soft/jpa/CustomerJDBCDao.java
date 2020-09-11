package com.training.soft.jpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerJDBCDao {

    @Autowired
    private DataSource dataSource;


    public List<Customer> query() {
        Connection connectionLoc = null;
        PreparedStatement prepareStatementLoc = null;
        ResultSet resultSetLoc = null;
        try {
            connectionLoc = this.dataSource.getConnection();
            prepareStatementLoc = connectionLoc.prepareStatement("select * from musteri where isim=?");
            prepareStatementLoc.setString(1,
                                          "osman");
            resultSetLoc = prepareStatementLoc.getResultSet();
            List<Customer> customers = new ArrayList<>();
            while (resultSetLoc.next()) {
                Customer customerLoc = new Customer();
                customerLoc.setName(resultSetLoc.getString("isim"));
                customerLoc.setSurname(resultSetLoc.getString("soyisim"));
                customers.add(customerLoc);
            }
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connectionLoc.close();
                prepareStatementLoc.close();
                resultSetLoc.close();
            } catch (Exception e) {
            }
        }
        return null;
    }

}
