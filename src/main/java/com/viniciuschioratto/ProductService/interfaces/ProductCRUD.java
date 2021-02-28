package com.viniciuschioratto.ProductService.interfaces;

import com.viniciuschioratto.ProductService.entity.Product;
import org.springframework.http.ResponseEntity;

public interface ProductCRUD {

    public ResponseEntity<String> insertNewProduct(Product product);

}
