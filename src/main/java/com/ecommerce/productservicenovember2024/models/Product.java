package com.ecommerce.productservicenovember2024.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Product extends Base {
    private String title;
    private double price;
    @ManyToOne
    private Category category;
}

/*
   1                   1
Product  ---------- Category => M:1
   M                   1
 */