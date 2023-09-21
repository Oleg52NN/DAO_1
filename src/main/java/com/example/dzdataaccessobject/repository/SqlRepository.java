package com.example.dzdataaccessobject.repository;

import com.example.dzdataaccessobject.entity.Customers;
import com.example.dzdataaccessobject.entity.Orders;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class SqlRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Orders> getProductName(String name) {

        Customers customers = entityManager.createQuery("select p from Customers p where p.name = :name", Customers.class)
                .setParameter("name", name)
                .getSingleResult();
        System.out.println(customers.getId() + "Mame = " + name + "Phone " + customers.getPhoneNumber());
        int customersId = customers.getId();
        return entityManager.createQuery("select p from Orders as p where p.customerId = :customersId", Orders.class)
                .setParameter("customersId", customersId)
                .getResultList();

    }
}
