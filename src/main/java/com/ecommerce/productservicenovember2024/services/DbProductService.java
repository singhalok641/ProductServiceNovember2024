package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.exceptions.ProductNotFoundException;
import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("dbProductService")
public class DbProductService implements ProductService{
    ProductRepository productRepository;
    public DbProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(productId); // productId = 1;

        if(optionalProduct.isEmpty()){
            throw new ProductNotFoundException("Product with id: " + productId + "does not exist");
        }

        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteSingleProduct(Long productId) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);

        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product with id: " + productId + "does not exist");
        }

        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> getLimitedProducts(Integer num) {
        return null;
    }

    // PATCH
    @Override
    public Product updateProduct(Long productId, Product product) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);

        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product with id: " + productId + "does not exist");
        }

        Product productInDb = productOptional.get();

        if(product.getTitle() != null) {
            productInDb.setTitle(product.getTitle());
        }

        if(product.getPrice() != null) {
            productInDb.setPrice(product.getPrice());
        }

        return productRepository.save(productInDb);
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }
}
