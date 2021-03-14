package com.viniciuschioratto.ProductService.interfaces;

import com.viniciuschioratto.ProductService.entity.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductCRUD {

    public ResponseEntity<String> insertNewProduct(Product product);

    public ResponseEntity<List<Product>> listProducts();

    public ResponseEntity<Product> singleProduct(String nameProduct);

    public ResponseEntity<String> updateProduct(String nameProduct);

    public ResponseEntity<String> deleteProduct(String nameProduct);

    public ResponseEntity<String> deleteProducts(List<String> listProducts);

}
