package com.example.testtask.controller;

import com.example.testtask.service.GoodsService;
import com.example.testtask.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebFormController {

    private final OrderService orderService;
    private final GoodsService goodsService;

    @Autowired
    public WebFormController(OrderService orderService, GoodsService goodsService) {
        this.orderService = orderService;
        this.goodsService = goodsService;
    }

    @GetMapping("/handbook")
    public String handbook() {
        return null;
    }
}
