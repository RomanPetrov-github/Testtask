package com.example.testtask.service;

import com.example.testtask.entity.Order;

import java.util.List;

public interface OrderService {
    void addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(Order order);
    List<Order> getAllOrder();
    Order getOrder(int id);
}
