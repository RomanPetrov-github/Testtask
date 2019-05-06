package com.example.testtask.service;

import com.example.testtask.entity.Goods;

import java.util.List;

public interface GoodsService {
    void addGoods(Goods goods);
    void updateGoods(Goods goods);
    void deleteGoods(Goods goods);
    List<Goods> getAllGoods();
    Goods getGoods(int id);
}
