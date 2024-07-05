package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Data
public class ShipmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shipmentId;

    private String shipmentMethod;

    private Timestamp shipmentDate;

    private String trackingNumber;

    @OneToOne
    @JoinColumn(name = "order_master_id")
    private OrderMaster orderMaster;
}
