package com.training.soft.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerJpaDao {

    //    @PersistenceUnit
    //    private EntityManager        entityManager;

    @PersistenceContext
    private EntityManagerFactory entityManagerFactory;


    @Transactional(dontRollbackOn = IllegalAccessException.class)
    public void jtaJava() {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        em.joinTransaction();
        Customer customerLoc = new Customer();
        em.persist(customerLoc);
        em.close();
    }

    public void queryJtaJava() {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        // Normal Query
        TypedQuery<Customer> createQueryLoc = em.createQuery("select c from Customer c where c.name=:deg1",
                                                             Customer.class);
        createQueryLoc.setParameter("deg1",
                                    "osman");
        List<Customer> resultList2Loc = createQueryLoc.getResultList();

        // Dynamic Query
        CriteriaQuery<Customer> criteriaQueryLoc = null;
        em.createQuery(criteriaQueryLoc);


        // Named Query
        Query createNamedQueryLoc = em.createNamedQuery("xyzQuery");
        createNamedQueryLoc.setParameter("deg1",
                                         "osman");
        List<Customer> resultListLoc = createNamedQueryLoc.getResultList();
        em.close();
    }

    public void normalJava() {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        try {
            em.getTransaction()
              .begin();
            Customer customerLoc = new Customer();
            em.persist(customerLoc);
            em.getTransaction()
              .commit();
        } catch (Exception eLoc) {
            em.getTransaction()
              .rollback();
        } finally {
            em.close();
        }
    }
}
