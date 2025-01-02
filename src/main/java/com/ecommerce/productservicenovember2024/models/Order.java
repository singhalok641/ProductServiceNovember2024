package com.ecommerce.productservicenovember2024.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
    private Long id;
    private String product;

    @ManyToOne
    private Customer customer;
}

// 1           M
// Customer -> order => 1: M
// 1            1