package com.dataJpaTut.JpaTutorial.controllers;

import com.dataJpaTut.JpaTutorial.entities.CustomerMaster;
import com.dataJpaTut.JpaTutorial.repositories.CustomerMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerServiceImpl {
    @Autowired
    private CustomerMasterRepo customerMasterRepo;

    @GetMapping("getData")
    public String getDetails() {
        return "Data Received";
    }

    @PostMapping("saveCustomers")
    public ResponseEntity<String> saveCustomers(@RequestBody List<CustomerMaster> customerMasterList){
        System.out.println("Save Customers Called");
        customerMasterList.forEach(e->{
            customerMasterRepo.save(e);
        });
        return ResponseEntity.ok().body("Success");
    }
 }
