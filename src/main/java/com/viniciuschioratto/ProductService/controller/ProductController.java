package com.viniciuschioratto.ProductService.controller;

import com.viniciuschioratto.ProductService.entity.Product;
import com.viniciuschioratto.ProductService.interfaces.ProductCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class ProductController {

    @Autowired
    private ProductCRUD productCRUDInterface;

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Product product) {
        return productCRUDInterface.insertNewProduct(product);
    }
}
