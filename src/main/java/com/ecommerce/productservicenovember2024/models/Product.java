package com.ecommerce.productservicenovember2024.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Product extends Base {
    private String title;
    private Double price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;
}

/*
   1                   1
Product  ---------- Category => M:1
   M                   1
 */