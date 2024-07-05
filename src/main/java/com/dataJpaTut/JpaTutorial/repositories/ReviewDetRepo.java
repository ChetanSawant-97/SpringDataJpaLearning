package com.dataJpaTut.JpaTutorial.repositories;

import com.dataJpaTut.JpaTutorial.entities.ReviewDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewDetRepo extends JpaRepository<ReviewDetails, UUID> {

}
