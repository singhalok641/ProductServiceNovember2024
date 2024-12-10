package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.exceptions.ProductNotFoundException;
import com.ecommerce.productservicenovember2024.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();
  
    List<Product> getLimitedProducts(Integer num);

    Product updateProduct(Long id, Product product);

    Product replaceProduct(Long id, Product product);
}
