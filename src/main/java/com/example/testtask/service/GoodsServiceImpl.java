package com.example.testtask.service;

import com.example.testtask.dao.GoodsRepository;
import com.example.testtask.dao.OrderRepository;
import com.example.testtask.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public void addGoods() {

    }

    @Override
    public void updateGoods() {

    }

    @Override
    public void deleteGoods() {

    }

    @Override
    public List<Goods> getAllGoods() {
        return null;
    }

    @Override
    public Goods getGoods(int id) {
        return null;
    }
}
