package com.example.dzdataaccessobject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date date;

    @Column(name = "customer_id", columnDefinition = "varchar(25)")
    private int customerId;

    @Column(name = "product_name", columnDefinition = "varchar(100)")
    private String productName;

    @Column
    private float amount;
}
