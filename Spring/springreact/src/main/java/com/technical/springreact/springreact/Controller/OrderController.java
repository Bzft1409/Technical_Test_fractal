package com.technical.springreact.springreact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technical.springreact.springreact.model.Orders;
import com.technical.springreact.springreact.repository.OrderRepository;
import com.technical.springreact.springreact.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepo;
    @GetMapping("/ordenes")
    public ResponseEntity<?> getAllOrders(){
        List<Orders> ordenes=orderService.getOrders();
        return new ResponseEntity<>(ordenes, ordenes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
    }

    @PostMapping("/ordenes")
    ResponseEntity<?> createOrder(@RequestBody Orders order){
        try {
            orderService.createOrder(order);
            orderRepo.save(order);
            return new ResponseEntity<Orders>(order,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
