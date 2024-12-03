package com.ecommerce.productservicenovember2024.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product extends Base {
    private String title;
    private double price;
    private Category category;
}

/*
1 "jeans"
3 "toy car"
3 "jeans"
4 "pen"




10^9

String, Enum, Entity

Category:
category name, category id, description

 */
