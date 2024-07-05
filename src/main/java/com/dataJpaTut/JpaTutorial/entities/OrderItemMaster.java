package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class OrderItemMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemId;

    private String orderStatus;

    private Timestamp orderDate;

    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "order_master_id")
    private OrderMaster orderMaster;

    @ManyToOne
    @JoinColumn(name = "product_master_id")
    private ProductMaster productMaster;
}
