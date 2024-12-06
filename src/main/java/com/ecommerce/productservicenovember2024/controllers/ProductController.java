package com.ecommerce.productservicenovember2024.controllers;

import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/limit/{num}")
    public List<Product> getLimitedProducts(@PathVariable("num") Integer num){
        return  productService.getLimitedProducts(num);
    }

}



/*
Product Service

1. create Product
2. get Product
3. update Product
4. delete Product

MySQL DB for this.


Client ----->     Product Service  ---->   Database (products: id, name, quantity, price) (Later)

We will use Fakestore API to code our Product Service

Implement Product Service which uses a 3rd party api behind the scenes

Client ----->     Product Service  ---->   FakeStore API (products: id, name, quantity, price)
                  (proxy service here)

Agenda:
How we are going to call third party apis from our product service

 */
