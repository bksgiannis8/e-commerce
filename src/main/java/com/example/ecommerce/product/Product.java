package com.example.ecommerce.product;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private String price;
}
