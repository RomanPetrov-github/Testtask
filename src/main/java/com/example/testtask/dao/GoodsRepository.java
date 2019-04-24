package com.example.testtask.dao;

import com.example.testtask.entity.Goods;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<Goods, Integer> {
}
