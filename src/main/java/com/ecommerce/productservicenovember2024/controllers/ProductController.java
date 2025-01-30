package com.ecommerce.productservicenovember2024.controllers;

import com.ecommerce.productservicenovember2024.exceptions.ProductNotFoundException;
import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    // TODO See how you can provide variable name and use configuration file to add the Qualifier
    public ProductController(@Qualifier("dbProductService") ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
//        ResponseEntity<Product> responseEntity = new ResponseEntity<>(
//                productService.getSingleProduct(id),
//                HttpStatus.OK
//        );
//
//        return responseEntity;
//    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {

        return new Product();
    }

    @GetMapping()
    public ResponseEntity<Page<Product>> getAllProducts(@RequestParam("pagenumber") int pageNumber,
                                                        @RequestParam("pageSize") int pageSize){
        ResponseEntity<Page<Product>> responseEntity = new ResponseEntity<>(
                productService.getAllProducts(pageNumber, pageSize),
                HttpStatus.OK
        );

        return responseEntity;
    }

    @PostMapping
    public Product addNewProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) throws ProductNotFoundException {
        productService.deleteSingleProduct(id);
    }

    @GetMapping("/limit/{num}")
    public List<Product> getLimitedProducts(@PathVariable("num") Integer num){
        return  productService.getLimitedProducts(num);
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.replaceProduct(id, product);
    }


    // Partial update
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) throws ProductNotFoundException {
        return productService.updateProduct(id, product);
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

/*
PUT -> replace the row/object
product -> name(NOT NULL), des(NULLABLE), price(NOT NULL), category (NULLABLE)

PUT -> Product -> name, des, price, category
    -> Product -> name, null, price, category
    -> Product -> null, des, price, category


PATCH -> update whatever is provided (partial update)


class A {
 B b;
}

A a = new A();

@Annotation that tells that please create an object/bean and store it in AppContext
class B {
}

How DI happends?
1. Constructor Injection
2. Setter Injection
3. Field Injection
 */

/*
Pagination

Pageable -> Represents a request for a specific page of data
PageRequest -> Concrete implementation of Pageable

 */


