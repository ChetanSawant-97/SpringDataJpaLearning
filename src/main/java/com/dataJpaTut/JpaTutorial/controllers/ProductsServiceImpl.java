package com.dataJpaTut.JpaTutorial.controllers;

import com.dataJpaTut.JpaTutorial.entities.ProductMaster;
import com.dataJpaTut.JpaTutorial.repositories.ProductMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsServiceImpl {
    @Autowired
    private ProductMasterRepo productMasterRepo;

    @PostMapping("saveProducts")
    public ResponseEntity<String> saveProducts(@RequestBody List<ProductMaster> productMasters){
        productMasters.forEach(e->productMasterRepo.save(e));
        return ResponseEntity.ok().body("Success");
    }
}
