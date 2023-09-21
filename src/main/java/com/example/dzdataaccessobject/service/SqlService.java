package com.example.dzdataaccessobject.service;

import com.example.dzdataaccessobject.entity.Customers;
import com.example.dzdataaccessobject.entity.Orders;
import com.example.dzdataaccessobject.repository.SqlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqlService {
    private final SqlRepository repository;

    public SqlService(SqlRepository repository) {
        this.repository = repository;
    }

    public List<Orders> getProducts(String name) {
        return repository.getProductName(name);
    }
}
