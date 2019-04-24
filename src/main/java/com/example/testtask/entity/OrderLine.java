package com.example.testtask.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLine {
    @Id
    private  int id;
    private  int order_id;
    private  int goods_id;
    private  int count;

    public OrderLine(int id, int order_id, int goods_id, int count) {
        this.id = id;
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.count = count;
    }
}
