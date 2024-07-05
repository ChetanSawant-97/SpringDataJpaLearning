package com.dataJpaTut.JpaTutorial.repositories;

import com.dataJpaTut.JpaTutorial.entities.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMasterRepo extends JpaRepository<OrderMaster, Long> {

}
