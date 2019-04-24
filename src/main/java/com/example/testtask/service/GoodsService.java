package com.example.testtask.service;

import com.example.testtask.entity.Goods;

import java.util.List;

public interface GoodsService {
    public void addGoods();
    public void updateGoods();
    public void deleteGoods();
    public List<Goods> getAllGoods();
    public Goods getGoods(int id);
}
