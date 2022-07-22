package com.technical.springreact.springreact.service;

import java.util.List;

import com.technical.springreact.springreact.model.Products;

public interface ProductService {
    
    public void createProduct(Products product);
    public List<Products> getAllProducts();
}
