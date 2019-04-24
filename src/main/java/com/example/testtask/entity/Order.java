package com.example.testtask.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {
    @Id
    private int id;
    private String client;
    private Date date;
    private String address;

    public Order(int id, String client, Date date, String address) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.address = address;
    }

}
