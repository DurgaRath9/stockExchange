package com.assignment.exc.controller;

import com.assignment.exc.service.StockOperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockOperationController {

    public static final Logger logger = LoggerFactory.getLogger(StockOperationController.class);

    @Autowired
    StockOperationService stockOperationService;

    @GetMapping("shares/v1/allShares")
    public ResponseEntity getAllShares(){
        return ResponseEntity.status(HttpStatus.OK).body(stockOperationService.getAllShares());
    }

    @GetMapping("shares/v1/shares/byId/{id}")
    public ResponseEntity getShareById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(stockOperationService.getShareById(id));
    }

    @GetMapping("shares/v1/shares/byName/{name}")
    public ResponseEntity getShareByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(stockOperationService.getShareByName(name));
    }
    
    @GetMapping("shares/v1/shares/recommendation")
    public ResponseEntity getRecommendation(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(stockOperationService.getRecommendation());
    }

}
