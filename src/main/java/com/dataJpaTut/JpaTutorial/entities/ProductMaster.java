package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ProductMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long productId;

    private String productName;

    private String productDesc;

    private double productPrice;

    private int stockQuantity;

    @OneToMany(mappedBy = "productMaster", cascade = CascadeType.ALL)
    private List<OrderItemMaster> orderItemMaster;

    @OneToMany(mappedBy = "productMaster", cascade = CascadeType.ALL)
    private List<ReviewDetails> reviewDetailsList;
}
