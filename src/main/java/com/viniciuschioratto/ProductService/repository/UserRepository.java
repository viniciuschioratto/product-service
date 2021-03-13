package com.viniciuschioratto.ProductService.repository;

import com.viniciuschioratto.ProductService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Product, String> {
}
