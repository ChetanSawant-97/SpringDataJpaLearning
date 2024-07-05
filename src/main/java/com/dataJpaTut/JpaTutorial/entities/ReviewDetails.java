package com.dataJpaTut.JpaTutorial.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
public class ReviewDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reviewId;

    private double rating;

    private String comment;

    private Timestamp reviewDate;

    @ManyToOne
    @JoinColumn(name = "customer_master_id")
    private CustomerMaster customerMaster;

    @ManyToOne
    @JoinColumn(name = "product_master_id")
    private ProductMaster productMaster;

}
