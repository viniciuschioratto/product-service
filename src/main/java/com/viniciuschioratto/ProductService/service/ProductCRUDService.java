package com.viniciuschioratto.ProductService.service;

import com.viniciuschioratto.ProductService.entity.Product;
import com.viniciuschioratto.ProductService.exception.InsertProductParametersException;
import com.viniciuschioratto.ProductService.interfaces.ProductCRUD;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductCRUDService implements ProductCRUD {

    @Override
    public ResponseEntity<String> insertNewProduct(Product product) {

        return ResponseEntity.status(HttpStatus.OK).body("ProductCRUDService");
    }
}
