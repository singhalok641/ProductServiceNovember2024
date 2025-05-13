package com.ecommerce.productservicenovember2024;

import com.ecommerce.productservicenovember2024.controllers.ProductController;
import com.ecommerce.productservicenovember2024.models.Category;
import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.projections.ProductWithIdAndTitle;
import com.ecommerce.productservicenovember2024.repositories.CategoryRepository;
import com.ecommerce.productservicenovember2024.repositories.ProductRepository;
import com.ecommerce.productservicenovember2024.services.ProductService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceNovember2024ApplicationTests {
    @Autowired
    private ProductService productService;

//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Test
//    void contextLoads() {
//    }

//    @Test
//    @Transactional
//    void testDbQueries(){
//        List<ProductWithIdAndTitle> productsWithIdAndTitle =
//                productRepository.randomSearchMethodForProduct();
//
//        for (ProductWithIdAndTitle product: productsWithIdAndTitle) {
//            System.out.println(product.getId() + " " + product.getTitle());
//        }
//
//        List<ProductWithIdAndTitle> productsWithIdAndTitleFromNative =
//                productRepository.nativeSearchMethodForProduct();
//
//        for (ProductWithIdAndTitle product: productsWithIdAndTitleFromNative) {
//            System.out.println(product.getId() + " " + product.getTitle());
//        }

//        Optional<Product> product = productRepository.findById(10L);


//        Optional<Category> category = categoryRepository.findById(1L);
//
//        if(category.isPresent()){
//            System.out.println(category.get().getName());
//            System.out.println(category.get().getProducts());
//        }
//
//        System.out.println("Getting Products");
//
//
//        System.out.println("DEBUG");
//    }

    @Test
    public void testAddition() {
        // 3A framework to write test cases
        // A - Arrange
        int a = 2;
        int b = 3;
        int expectedResult = 5;

        // A - Act
        int actualResult = addition(a, b);

        // Assert or check
//        assert expectedResult == actualResult;

        String c = "Alok";
        String d = "Alok";
        assertEquals(expectedResult, actualResult);
        assertEquals(d, c);

        assertNotEquals(a, b);
        // Product p = ps.getProduct(1);
//        assertNotNull(p);
//        assertEquals(p.title, "pen product");


    }

    @Test
    public void productServiceTest() {
        assertTimeout(Duration.ofMillis(50),
                () -> productService.getSingleProduct(1L));
    }

    private int addition(int a, int b) {
        return a + b;
    }

}
