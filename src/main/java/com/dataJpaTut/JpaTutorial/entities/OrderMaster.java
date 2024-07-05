package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class OrderMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long orderId;

    private int orderQuantity;

    private double price;

    @ManyToOne
    @JoinColumn(name = "customer_master_id")
    private CustomerMaster customerMaster;

    @OneToMany(mappedBy = "orderMaster", cascade = CascadeType.ALL)
    private List<OrderItemMaster> orderItemMasterList;

    @OneToOne(mappedBy = "orderMaster", cascade = CascadeType.ALL)
    private PaymentDetails paymentDetails;

    @OneToOne(mappedBy = "orderMaster", cascade = CascadeType.ALL)
    private ShipmentDetails shipmentDetails;


}
