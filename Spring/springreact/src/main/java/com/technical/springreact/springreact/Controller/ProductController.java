package com.technical.springreact.springreact.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technical.springreact.springreact.model.Products;
import com.technical.springreact.springreact.repository.ProductRepository;
import com.technical.springreact.springreact.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/productos")
    public ResponseEntity<?> getAllProducts(){
        List<Products> productos= productService.getAllProducts();

        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
    @PostMapping("/productos")
    public ResponseEntity<?> createProduct(@RequestBody Products product){
        try{
            productService.createProduct(product);
            productRepository.save(product);
            return new ResponseEntity<>(product,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("error",HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
