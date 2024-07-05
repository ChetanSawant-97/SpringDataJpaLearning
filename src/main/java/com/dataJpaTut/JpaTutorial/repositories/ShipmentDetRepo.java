package com.dataJpaTut.JpaTutorial.repositories;

import com.dataJpaTut.JpaTutorial.entities.ShipmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentDetRepo extends JpaRepository<ShipmentDetails, Long> {
}
