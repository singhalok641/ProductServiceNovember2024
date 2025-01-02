package com.ecommerce.productservicenovember2024.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE)
    private List<Order> orders = new ArrayList<>();


}
