package com.ecommerce.productservicenovember2024.experimentation.inheritanceTypes.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_instructors")
public class Instructor extends User {
    private String module;
}
