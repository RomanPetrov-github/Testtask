package com.example.testtask.service;

import com.example.testtask.entity.Order;

import java.util.List;

public interface OrderService {
    public void addOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(Order order);
    public List<Order> getAllOrder();
    public Order getOrder(int id);
}
