package com.viniciuschioratto.ProductService.controller;

import com.viniciuschioratto.ProductService.interfaces.ProductCRUD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductControllerTests {

    @InjectMocks
    private ProductController productController = new ProductController();

    @Mock
    private ProductCRUD productCRUDInterface;

    @Test
    @DisplayName("Must return a value after test the function insert")
    public void testInsert() {

    }
}
