package com.technical.springreact.springreact.service;

import java.util.List;

import com.technical.springreact.springreact.model.Orders;

public interface OrderService {
    public void createOrder(Orders order);
    public List<Orders> getOrders();
}
