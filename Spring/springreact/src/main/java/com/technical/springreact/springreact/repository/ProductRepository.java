package com.technical.springreact.springreact.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.technical.springreact.springreact.model.Products;

@Repository
public interface ProductRepository extends MongoRepository<Products,String> {
    
}
