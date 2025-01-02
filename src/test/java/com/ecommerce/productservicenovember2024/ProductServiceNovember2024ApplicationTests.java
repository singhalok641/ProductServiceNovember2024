package com.ecommerce.productservicenovember2024;

import com.ecommerce.productservicenovember2024.projections.ProductWithIdAndTitle;
import com.ecommerce.productservicenovember2024.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceNovember2024ApplicationTests {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDbQueries(){
        List<ProductWithIdAndTitle> productsWithIdAndTitle =
                productRepository.randomSearchMethodForProduct();

        for (ProductWithIdAndTitle product: productsWithIdAndTitle) {
            System.out.println(product.getId() + " " + product.getTitle());
        }

        List<ProductWithIdAndTitle> productsWithIdAndTitleFromNative =
                productRepository.nativeSearchMethodForProduct();

        for (ProductWithIdAndTitle product: productsWithIdAndTitleFromNative) {
            System.out.println(product.getId() + " " + product.getTitle());
        }

        System.out.println("DEBUG");
    }

}
