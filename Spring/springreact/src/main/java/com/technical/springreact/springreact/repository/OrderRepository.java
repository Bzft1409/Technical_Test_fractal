package com.technical.springreact.springreact.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.technical.springreact.springreact.model.Orders;

@Repository
public interface OrderRepository extends MongoRepository<Orders,String>{

    @Query("{'orderNumber:?0'}")
    Optional<Orders> findbyOrderNumber(int number);
    
}
