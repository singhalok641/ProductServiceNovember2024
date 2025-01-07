package com.ecommerce.productservicenovember2024.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Category extends Base{
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
