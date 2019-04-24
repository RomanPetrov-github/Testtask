package com.example.testtask.service;

import com.example.testtask.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl {

    private final OrderRepository orderRepository;

    @Autowired
    public GoodsServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
