package com.technical.springreact.springreact.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.springreact.springreact.model.Products;
import com.technical.springreact.springreact.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    @Override
    public void createProduct(Products product) {
          List<Products> Listar=productRepo.findAll();
           for( Products producto:Listar){
            if(!(product.getName().equals(producto.getName()))){
                productRepo.save(product);
            }
           }
    }

    @Override
    public List<Products> getAllProducts() {
        List<Products> productos=productRepo.findAll();
        if(productos.size()>0){
            return productos;
           } else{
            return new ArrayList<Products>();
           }
    }
    
}
