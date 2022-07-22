package com.technical.springreact.springreact.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.springreact.springreact.model.Orders;
import com.technical.springreact.springreact.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepo;
    @Override
    public void createOrder(Orders order) {
        List<Orders> Listar=orderRepo.findAll();
        for( Orders ordenes:Listar){
         if(!(ordenes.getOrderNumber()==order.getOrderNumber())){
             orderRepo.save(order);
         }
        }
        
    }

    @Override
    public List<Orders> getOrders() {
        List<Orders> ordenes=orderRepo.findAll();
        if(ordenes.size()>0){
            return ordenes;
        } else{
            return new ArrayList<Orders>();
        }
    }
    
}
