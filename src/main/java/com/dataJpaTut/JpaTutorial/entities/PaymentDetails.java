package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID paymentProcessId;

    private Timestamp paymentDate;

    private double paymentAmount;

    private String paymentMethod;

    @OneToOne
    @JoinColumn(name = "order_master_id")
    private OrderMaster orderMaster;

}
