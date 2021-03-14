package com.viniciuschioratto.ProductService.controller;

import com.viniciuschioratto.ProductService.entity.Product;
import com.viniciuschioratto.ProductService.interfaces.ProductCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/crud")
public class ProductController {

    @Autowired
    private ProductCRUD productCRUDInterface;

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Product product) {
        return productCRUDInterface.insertNewProduct(product);
    }

    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getListProduct() {
        return productCRUDInterface.listProducts();
    }

    @RequestMapping(value = "/product/{nameProduct}", method = RequestMethod.GET)
    public ResponseEntity<Product> getSingleProduct(@PathVariable("nameProduct") String nameProduct) {
        return productCRUDInterface.singleProduct(nameProduct);
    }

    @RequestMapping(value = "/update/{nameProduct}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateProduct(@PathVariable("nameProduct") String nameProduct) {
        return productCRUDInterface.updateProduct(nameProduct);
    }

    @RequestMapping(value = "/delete/{nameProduct}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteSingleProduct(@PathVariable("nameProduct") String nameProduct) {
        return productCRUDInterface.deleteProduct(nameProduct);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteListProduct(@RequestBody List<String> listProduct) {
        return productCRUDInterface.deleteProducts(listProduct);
    }
}
