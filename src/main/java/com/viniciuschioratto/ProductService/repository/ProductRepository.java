package com.viniciuschioratto.ProductService.repository;

import com.viniciuschioratto.ProductService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, UUID> {
}
