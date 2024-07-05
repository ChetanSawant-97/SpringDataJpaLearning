package com.dataJpaTut.JpaTutorial.controllers;

import com.dataJpaTut.JpaTutorial.entities.OrderMaster;
import com.dataJpaTut.JpaTutorial.repositories.OrderMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderMasterServiceImpl {
    @Autowired
    private OrderMasterRepo orderMasterRepo;

    @PostMapping("saveOrders")
    public ResponseEntity<String> saveOrders(@RequestBody List<OrderMaster> orderMasterList){
        orderMasterList.forEach(e->{
            orderMasterRepo.save(e);
        });
        return ResponseEntity.ok().body("Success");
    }
}
