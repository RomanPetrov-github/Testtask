package com.example.testtask.service;

import com.example.testtask.dao.OrderRepository;
import com.example.testtask.entity.Goods;
import com.example.testtask.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void updateOrder(Order order) {
        if (orderRepository.existsById(order.getId())) {
            orderRepository.deleteById(order.getId());
        }
        addOrder(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> result = new ArrayList<>();
        for (Order order: orderRepository.findAll()){
            result.add(order);
        }
        return result;
    }

    @Override
    public Order getOrder(int id) {
        return orderRepository.findById(id).get();
    }
}
