package com.ecommerce.productservicenovember2024.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Category extends Base{
    private String name;
    private String description;
}
