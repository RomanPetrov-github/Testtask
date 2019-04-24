package com.example.testtask.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Goods {
    @Id
    private int id;
    private String name;
    private double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
