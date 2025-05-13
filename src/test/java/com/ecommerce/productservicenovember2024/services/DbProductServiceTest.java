package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.exceptions.ProductNotFoundException;
import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class DbProductServiceTest {
    @Autowired
    private DbProductService dbProductService;

    @MockitoBean
    private ProductRepository productRepository;

    @Test
    void getSingleProduct() throws ProductNotFoundException {
        Long productId = 2L;
        Product expectedProduct = new Product();
        expectedProduct.setId(productId);
        expectedProduct.setTitle("Iphone Pro Max Ultra");
        expectedProduct.setPrice(10000.0);

        when(productRepository.findById(productId))
                .thenReturn(Optional.of(expectedProduct));

        Product actualProduct = dbProductService.getSingleProduct(productId);

        assertNotNull(actualProduct);
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void getAllProducts() {
    }

    @Test
    void addNewProduct() {
    }

    @Test
    void deleteSingleProduct() {
    }

    @Test
    void getLimitedProducts() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void replaceProduct() {
    }
}