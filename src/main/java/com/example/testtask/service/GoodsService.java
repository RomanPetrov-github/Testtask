package com.example.testtask.service;

import com.example.testtask.entity.Goods;

import java.util.List;

public interface GoodsService {
    public void addGoods(Goods goods);
    public void updateGoods(Goods goods);
    public void deleteGoods(Goods goods);
    public List<Goods> getAllGoods();
    public Goods getGoods(int id);
}
