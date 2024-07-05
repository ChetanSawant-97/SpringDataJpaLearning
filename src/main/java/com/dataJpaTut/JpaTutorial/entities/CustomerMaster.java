package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CustomerMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    private String customerName;

    private String customerEmail;

    private String customerAddress;

    @OneToMany(mappedBy = "customerMaster", cascade = CascadeType.ALL)
    private List<OrderMaster> orderMasterList;

    @OneToMany(mappedBy = "customerMaster", cascade = CascadeType.ALL)
    private List<ReviewDetails> reviewDetailsList;

}
