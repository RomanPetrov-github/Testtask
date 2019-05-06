package com.example.testtask.service;

import com.example.testtask.dao.GoodsRepository;
import com.example.testtask.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public void addGoods(Goods goods) {
        goodsRepository.save(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        if (goodsRepository.existsById(goods.getId())) {
            goodsRepository.deleteById(goods.getId());
        }
        addGoods(goods);
    }

    @Override
    public void deleteGoods(Goods goods) {
        goodsRepository.delete(goods);
    }

    @Override
    public List<Goods> getAllGoods() {
        List<Goods> result = new ArrayList<>();
        for (Goods goods: goodsRepository.findAll()){
            result.add(goods);
        }
        return result;
    }

    @Override
    public Goods getGoods(int id) {
        return goodsRepository.findById(id).get();
    }
}
