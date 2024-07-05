package com.dataJpaTut.JpaTutorial.repositories;

import com.dataJpaTut.JpaTutorial.entities.OrderItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItemMaster, Long> {
}
