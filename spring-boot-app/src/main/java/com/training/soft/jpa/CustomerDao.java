package com.training.soft.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerDao extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameAndSurname(String name,
                                        String surname);

    List<Customer> findByNameIn(List<String> name);

    @Query("select c from Customer c where c.name=:deg1")
    List<Customer> bulName(@Param("deg1") String name);

    @Query(value = "select * from musteri where isim=:deg1", nativeQuery = true)
    List<Customer> bulNativeName(@Param("deg1") String name);

    //    @Query("xyzQuery")
    //    List<Customer> bulFromNamedQueryName(@Param("deg1") String name);

}
