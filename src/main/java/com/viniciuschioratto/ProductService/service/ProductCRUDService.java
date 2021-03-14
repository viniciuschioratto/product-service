package com.viniciuschioratto.ProductService.service;

import com.viniciuschioratto.ProductService.entity.Product;
import com.viniciuschioratto.ProductService.exception.InsertProductParametersException;
import com.viniciuschioratto.ProductService.interfaces.ProductCRUD;
import com.viniciuschioratto.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCRUDService implements ProductCRUD {

    @Autowired(required = true)
    private ProductRepository productRepository;

    private static ProductCRUDService INSTANCE;

    private ProductCRUDService() {}

    public static ProductCRUDService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProductCRUDService();
        }
        return INSTANCE;
    }

    @Override
    public ResponseEntity<String> insertNewProduct(Product product) {

        try {
            if (!checkParameters(product)) {
                throw new InsertProductParametersException("Name is required");
            }
            productRepository.save(product);
        } catch (InsertProductParametersException insertProductParametersException) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(insertProductParametersException.getMessage());
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error to salve the data: " + exception);
        }
        return ResponseEntity.status(HttpStatus.OK).body("Product inserted with success in the data base.");
    }

    @Override
    public ResponseEntity<List<Product>> listProducts() {
        return null;
    }

    @Override
    public ResponseEntity<Product> singleProduct(String nameProduct) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateProduct(String nameProduct) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteProduct(String nameProduct) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteProducts(List<String> listProducts) {
        return null;
    }

    private boolean checkParameters(Product product) {
        return product.isValid();
    }
}
