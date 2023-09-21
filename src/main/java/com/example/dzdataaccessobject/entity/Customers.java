package com.example.dzdataaccessobject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(schema = "public")

public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(25)", nullable = false)
    private String name;

    @Column(columnDefinition = "varchar(25)", nullable = false)
    private String surname;

    @Column(nullable = false)
    @Min(0)
    private int age;

    @Column(name = "phone_number", columnDefinition = "varchar(15)", nullable = false)
    private String phoneNumber;

}
