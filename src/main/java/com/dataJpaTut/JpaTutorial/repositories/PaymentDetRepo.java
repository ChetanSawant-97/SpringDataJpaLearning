package com.dataJpaTut.JpaTutorial.repositories;

import com.dataJpaTut.JpaTutorial.entities.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PaymentDetRepo extends JpaRepository<PaymentDetails, UUID> {
}
