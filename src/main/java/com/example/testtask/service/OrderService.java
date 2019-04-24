package com.example.testtask.service;

import com.example.testtask.entity.Order;

import java.util.List;

public interface OrderService {
    public void addOrder();
    public void updateOrder();
    public void deleteOrder();
    public List<Order> getAllOrder();
    public Order getOrder(int id);
}
