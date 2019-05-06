package com.example.testtask.service;

import com.example.testtask.dao.OrderRepository;
import com.example.testtask.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrder() {

    }

    @Override
    public void updateOrder() {

    }

    @Override
    public void deleteOrder() {

    }

    @Override
    public List<Order> getAllOrder() {
        return null;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }
}
