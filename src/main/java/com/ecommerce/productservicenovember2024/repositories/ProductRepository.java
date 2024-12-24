package com.ecommerce.productservicenovember2024.repositories;

import com.ecommerce.productservicenovember2024.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Product Repo - should contain all the methods(CRUD) related to the Product model

    // select * from products where price >
    List<Product> findProductByPriceGreaterThan(Double price);

    // select * from products where title like '%iphone%'
    List<Product> findProductByTitleLike(String title);

    // select * from products where title like 'iphone' LIMIT 5
//    List<Product> findProductByTitleLike(int top, String title);

    List<Product> findByPriceBetween(Double p1, Double p2);
}
