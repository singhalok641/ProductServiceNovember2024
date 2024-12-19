package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DbProductService implements ProductService{
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<Product> getLimitedProducts(Integer num) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }
}
