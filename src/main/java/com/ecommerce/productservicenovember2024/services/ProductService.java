package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.exceptions.ProductNotFoundException;
import com.ecommerce.productservicenovember2024.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();

    void deleteSingleProduct(Long product_id) throws ProductNotFoundException;
  
    List<Product> getLimitedProducts(Integer num);

    Product updateProduct(Long id, Product product) throws ProductNotFoundException;

    Product replaceProduct(Long id, Product product);
}
